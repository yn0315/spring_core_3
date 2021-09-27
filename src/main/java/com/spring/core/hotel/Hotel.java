package com.spring.core.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//컨트롤 + E 최근 연 항목
//alt 방향키 열려있는 옆 클래스로 넘어감

//이 클래스를 스프링 컨테이너에 등록한다.
@Component
public class Hotel {

    private final Restaurant restaurant;

    //자동주입설정
    @Autowired
    public Hotel(@Qualifier("cr") Restaurant restaurant) {
        System.out.println("호텔 생성자 호출!");
        this.restaurant = restaurant;
    }

    public void reserve() {
        System.out.println("레스토랑을 예약합니다.");
        restaurant.orderDinner();
    }
}
