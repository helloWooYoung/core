package hello.core.discount;


import hello.core.member.Grade;
import hello.core.member.Member;


public class FixdiscountPolicy implements  DiscountPolicy {

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        // enum type 경우 == 쓰는것이고
        // string의 경우 "값".equals(객체);
        if (member.getGrade() == Grade.VIP){
            return discountFixAmount;
        }else {
            return 0;
        }
    }
}
