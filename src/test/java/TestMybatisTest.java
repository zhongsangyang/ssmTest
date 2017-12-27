import com.alibaba.fastjson.JSON;
import gzfzkj.model.User;
import gzfzkj.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by 钟桑扬 on 2017-12-20.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:config/spring-mybatis.xml"})
public class TestMybatisTest {
    @Resource
    private UserService userService;
    private static Logger logger= LoggerFactory.getLogger(TestMybatisTest.class);

    @Test
    public  void test1(){
        User user=userService.getUserByUserId(1);
        System.out.println(user.getAge());
    }
    @Test
    public  void test2(){
        Integer i=userService.isExistUserId(1);
        System.out.println(i);
    }
    @Test
    public  void test3(){
        User user=new User();
        user.setUsername("中午忙");
        user.setPassword("33888");
        user.setAge(15);
        Integer i=userService.testInserKey(user);
        System.out.println(user.getId());
    }

}

