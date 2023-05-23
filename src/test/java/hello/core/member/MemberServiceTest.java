package hello.core.member;

import org.junit.jupiter.api.Assertions;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;


public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join (){

        //given when then -> 이러한 조건이 주어 졌을때, 이렇게 하면 -> then이 된다.

        //given

        Member member = new Member(1L, "memberA", Grade.VIP);


        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        assertThat(findMember.getId()).isEqualTo(member.getId());


        // OCP랑  DIP를 잘 지키고 있는지

    }


}
