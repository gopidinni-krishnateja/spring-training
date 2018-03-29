package com.example.componentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bean {
    private Bean1 bean1;
    private Bean2 bean2;
    public Bean(){
        System.out.println("Calling a Bean");
    }

    @Autowired
    public void setBean1(Bean1 bean1) {
        this.bean1=bean1;
        System.out.println("Setting the bean1 Refrence");
    }
    @Autowired
    public void setBean2(Bean2 bean2) {
        this.bean2=bean2;
        System.out.println("Setting the bean2 Refrence");
    }
}
