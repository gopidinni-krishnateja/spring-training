package com.example.customEvent;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
    private String event;
    public CustomEvent(Object source, String name) {
        super(source);
        this.event=name;
    }
    public String toString(){
        return event;
    }
}
