package com.spring.core.oop.member;

//역할: 적당한 회원 저장소에 저장명령을 내리는 책임
public class MemberService {//클라이언트역할

     private MemberRepository memberRepository;//협력관계로 설정//서버역할


     public MemberService(MemberRepository memberRepository) {//감독은 배우캐스팅은 관여하지 마라. ocp 개방 폐쇄원칙

          //배역            =    배우
          this.memberRepository = this.memberRepository;
     }

     //회원가입 명령 기능
     public void join(Member member){
          memberRepository.save(member);

     }

     //회원조회 명령 기능
     public Member findMember(Long memberId) {
          return memberRepository.findById(memberId);
     }

}
