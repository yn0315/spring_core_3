package com.spring.core.oop.quiz;

import org.springframework.stereotype.Component;

@Component
public class LgKeyboard implements KeyBoard{
    @Override
    public void info() {
        System.out.println("LG키보드입니다.");
    }
}
