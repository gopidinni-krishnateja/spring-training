package com.example.customEvent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

    EventPublisher cvp =
                (EventPublisher) context.getBean("EventPublisher");
    String name="Krishna";
        cvp.publish(name);

    }
}
