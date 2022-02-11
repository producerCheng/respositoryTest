package com.gupaoedu.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ){
        //dubbo://192.168.13.1:20880/com.gupaoedu.dubbo.IPayService
        //http://192.165...
        ClassPathXmlApplicationContext classPathXmlApplicationContext=
                new ClassPathXmlApplicationContext(new String[]{"application.xml"});

        IPayService payService=(IPayService) classPathXmlApplicationContext.
                getBean("payService");

        String rs=payService.pay("Test"); //pay方法一定是远程调用
        System.out.println(rs);
    }
}
