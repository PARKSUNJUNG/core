package hello.core.member;

public interface MemberRepository {

    void save(Member member);  // 회원가입

    Member findById(Long memberId); // 아이디로 회원 조회
}
