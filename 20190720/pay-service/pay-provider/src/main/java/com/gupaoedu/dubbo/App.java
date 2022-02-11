package com.gupaoedu.dubbo;

import org.apache.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        Main.main(new String[]{"spring","log4j"}); //Dubbo提供的启动类方法，它会启动dobbu中配置的多个container

        //除了spring里面通过api的方式去加载springxml文件，还有其他方式？
    }
}
