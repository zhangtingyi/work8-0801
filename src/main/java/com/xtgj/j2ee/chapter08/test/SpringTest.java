package com.xtgj.j2ee.chapter08.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xtgj.j2ee.chapter08.service.PersonService;


public class SpringTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

   /* @Test  //创建的单元测试
    public void testSave() {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonService ps = (PersonService)ctx.getBean("personService");
        ps.save();
        ctx.close(); //有了这一句才会有destroy方法的调用
    }*/
    @Test
    public void testSave() {
         AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml ");
            PersonService ps = (PersonService)ctx.getBean("personService");
            PersonService ps1 = (PersonService)ctx.getBean("personService");
            System.out.println(ps==ps1);
            ctx.close();

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonService ps2=(PersonService) context.getBean("personService");

        ps2.save();

    }


}

