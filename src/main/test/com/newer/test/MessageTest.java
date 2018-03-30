package com.newer.test;

import org.junit.Test;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageTest {

    @Test
    public void test(){
        MessageSource messageSource=new ClassPathXmlApplicationContext("springmvc.xml");
        String message=messageSource.getMessage("title_zh",null,"Default",null);
        System.out.println(message);
    }
}
