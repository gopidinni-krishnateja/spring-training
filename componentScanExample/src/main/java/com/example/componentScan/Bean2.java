package com.example.componentScan;

import org.springframework.stereotype.Component;
@Component
public class Bean2 {

    private Bean2(){
        System.out.println("Calling Bean2");
    }
}
