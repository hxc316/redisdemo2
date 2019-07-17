package redis.demo2.redisdemo2.service;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import redis.demo2.redisdemo2.entity.FocusData;

import java.util.Set;

@Slf4j
@Component
public class RedisService2 {
    @Autowired
    RedisTemplate redisTemplate;
    // 5002
    public void add(){
        log.info("5002 关注了 1000 时间是 ： 2019-07-15 11:26:05");
        redisTemplate.opsForSet().add("of_1000",new FocusData(5002,"2019-07-15 11:26:05"));
    }

    public void a(){
        Set<FocusData> of_1000 = redisTemplate.opsForSet().members("of_1000");
        log.info("of 1000 的粉丝 = {}",new Gson().toJson(of_1000));

    }

}
