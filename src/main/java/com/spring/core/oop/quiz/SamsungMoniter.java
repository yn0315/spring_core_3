package com.spring.core.oop.quiz;

import org.springframework.stereotype.Component;

@Component
public class SamsungMoniter implements Monitor{
    @Override
    public void info() {
        System.out.println("삼성모니터입니다.");
    }
}
