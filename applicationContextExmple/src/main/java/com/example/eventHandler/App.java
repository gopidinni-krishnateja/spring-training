package com.example.eventHandler;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        app.start();
        Message msg = (Message) app.getBean("message");
        msg.getMessage();
        app.stop();
    }
}
