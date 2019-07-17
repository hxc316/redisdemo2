package redis.demo2.redisdemo2;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import redis.demo2.redisdemo2.service.SortSetService;

public class SortSetServiceTest extends Redisdemo2ApplicationTests{

    @Autowired
    private SortSetService sortSetService;

    @Test
    public void s(){
        sortSetService.add();
        sortSetService.list();
    }

}
