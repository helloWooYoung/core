package hello.core.member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    //MemberServiceImpl 인터페이스로 인해서 MemberRepository(추상화) 의존 한다 하지만 MemoryMemberRepository (구현체) 의존한다. 따라서 DIP 위반하고 있다.

    /*
    *  DIP는 다음과 같은 정의를 가진다.
    * 상위 모듈은 하위 모듈에 의존해서는 안된다
      추상화는 세부 사항에 의존해서는 안된다
      *
      * DIP의 핵심은 의존 관계를 맺을때 변화하기 쉬운것에 의존하기 보다는 변하지 않는 것에 의존 하는 것이 원칙.
    *
    * */


    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);

    }
}
