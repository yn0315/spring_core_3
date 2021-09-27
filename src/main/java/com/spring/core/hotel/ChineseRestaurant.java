package com.spring.core.hotel;

import org.springframework.stereotype.Component;

@Component("cr")//컴포넌트 별칭 정해놓으면 qualifier 쓸 때 이걸로 쓰면 됨
public class ChineseRestaurant implements Restaurant{

    private final Chef chef;

    public ChineseRestaurant(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void orderDinner() {
        System.out.println("중국요리를 주문합니다.");
        chef.cook();
    }
}
