package kr.co.tj.member;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, String>{

	Optional<MemberEntity> findByUsername(String username);


}
