package com.example.customEvent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EventHandler implements ApplicationListener<CustomEvent>{
    public void onApplicationEvent(CustomEvent applicationEvent) {
        System.out.println("Listenr----> "+applicationEvent.toString());
    }
}
