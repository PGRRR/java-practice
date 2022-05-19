package nosleepcoders.golf.repository;

import nosleepcoders.golf.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    Optional<Member> findById(Long id);

    Optional<Member> findByName(String userId);

    List<Member> findAll();
}
