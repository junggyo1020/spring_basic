package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private final int discountFixAmount = 1000; //1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) { //ENUM type은 equals가 아닌 ==을 사용한다.
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}