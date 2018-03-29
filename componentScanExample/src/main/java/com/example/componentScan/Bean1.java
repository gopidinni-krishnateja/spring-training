package com.example.componentScan;

import org.springframework.stereotype.Component;

@Component
public class Bean1 {
    private Bean1(){
        System.out.println("Calling Bean 1");
    }
}
