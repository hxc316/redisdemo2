package redis.demo2.redisdemo2;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import redis.demo2.redisdemo2.service.RedisService;

public class A1 extends Redisdemo2ApplicationTests {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    @Autowired
    RedisService redisService;
    @Test
    public void s(){
        redisTemplate.opsForSet().add("1", "1", "2");
    }

    @Test
    public void s1(){
        redisService.fans();
    }

    @Test
    public void s2(){
        redisService.focus();
    }
}
