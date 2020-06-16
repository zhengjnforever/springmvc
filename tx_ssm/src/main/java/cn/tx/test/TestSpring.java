package cn.tx.test;

import cn.tx.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: tx_ssm
 * @description: 测试
 * @author: Sam
 * @create: 2020-06-07 15:44
 **/

public class TestSpring {

    /*
     *
     * @param null
     * @return
     * @author yuxin
     * @creed: 测试spring文件
     * @date 2020/6/7 15:46
     */

    @Test
    public void run1(){
        //创建工厂，加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        AccountService service = ac.getBean(AccountService.class);

        service.findAll();


    }

}
