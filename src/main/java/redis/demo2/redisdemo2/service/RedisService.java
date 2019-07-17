package redis.demo2.redisdemo2.service;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.Set;

@Slf4j
@Component
public class RedisService {
    @Autowired
    private RedisTemplate redisTemplate;

    public void focus(){
        redisTemplate.setEnableTransactionSupport(true);
        log.info("1001 关注 1000");
        redisTemplate.multi();
        redisTemplate.opsForSet().add("f_1000",1001);
        redisTemplate.opsForSet().add("g_1001",1000);
        redisTemplate.exec();
    }

    public void fans(){
        Set<Integer> f_1000 = redisTemplate.opsForSet().members("f_1000");

        log.info("1000 的粉丝 :");
        for(Integer s: f_1000){
            System.out.println(s);
        }
        Set<Integer> g_1001 = redisTemplate.opsForSet().members("g_1001");
        log.info("1001的关注: ");
        for(Integer s: g_1001){
            System.out.println(s);
        }
    }


}
