package com.spring.core.oop.order;

import com.spring.core.oop.discount.DiscountPolicy;
import com.spring.core.oop.member.Grade;
import com.spring.core.oop.member.Member;
import com.spring.core.oop.member.MemberRepository;
import com.spring.core.oop.member.MemoryMemberRepository;

//역할: 적당한 회원저장소에서 회원정보를 조회한 후
//      회원등급에 따라 적당한 할인정책을 적용한 주문정보를 생성하는 책임
public class OrderService {

    private final MemberRepository memberRepository;//실행중에 못 고치게
    private final DiscountPolicy discountPolicy;//final로 만들어두면 까먹을 일 없으니 안전

    public OrderService(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;//
        this.discountPolicy = discountPolicy;//이거 안쓰면 nullpointerexception 뜸
    }

    //주문기능
    public Order createOrder(Long id, String itemName, int price) {
        Member member =  memberRepository.findById(id);
        Grade grade = member.getGrade();
        //주문생성할인 적용

        int discount = discountPolicy.discount(member, price);
        Order order = new Order(id, itemName, price, discount);
    return order;
    }

}
