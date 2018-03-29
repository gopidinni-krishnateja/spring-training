package com.example.customEvent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher=applicationEventPublisher;
    }
    public void publish(String name){
        CustomEvent customEvent =new CustomEvent(this,name);
        publisher.publishEvent(customEvent);
    }
}
