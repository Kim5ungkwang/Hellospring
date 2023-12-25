package hello.spring.hellospring.repository;

import hello.spring.hellospring.domain.Member;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.AfterEach;

public interface MemberRepository {

    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();

    void clearStore();
}
