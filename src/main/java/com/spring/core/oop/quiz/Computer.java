package com.spring.core.oop.quiz;

import com.spring.core.hotel.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    private final KeyBoard keyBoard;
    private final Mouse mouse;
    private final Monitor monitor;

    @Autowired//매개변수가 모두 final일 경우 생략가능하나 붙이는 게 좋음
    public Computer(KeyBoard keyBoard, Mouse mouse, Monitor monitor) {
        this.keyBoard = keyBoard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    //부품정보를 보여주는 메서드
    public void showParts() {
        keyBoard.info();
        monitor.info();
        mouse.info();
    }


}


