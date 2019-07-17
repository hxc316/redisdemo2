package redis.demo2.redisdemo2.service;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import redis.demo2.redisdemo2.entity.FocusData;

import java.util.Set;

@Service
@Slf4j
public class SortSetService {

    @Autowired
    private RedisTemplate redisTemplate;

    public void add(){
        log.info("5002 关注了 1000 时间是 ： 2019-07-15 17:47:46");
        redisTemplate.opsForZSet().add("zf_1000",new FocusData(3018,"2019-07-15 17:50:46"),System.currentTimeMillis());
    }

    public void list(){
        Set<FocusData> of_1000 = redisTemplate.opsForZSet().range("zf_1000",0,System.currentTimeMillis());
        log.info("zf 加入有序： of 1000 的粉丝 = {}",new Gson().toJson(of_1000));

    }
}
