package redis.demo2.redisdemo2;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import redis.demo2.redisdemo2.service.RedisService2;

public class RedisService2Test extends Redisdemo2ApplicationTests {

    @Autowired
    RedisService2 redisService2;

    @Test
    public void s(){
        redisService2.add();
        redisService2.a();
    }
}
