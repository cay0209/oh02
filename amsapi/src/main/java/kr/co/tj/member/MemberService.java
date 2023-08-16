package kr.co.tj.member;




import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository memberRepository;

	public MemberDTO create(MemberDTO memberDTO) {
		
		MemberEntity memberEntity = memberDTO.toEntity();
		
		
		
		Optional<MemberEntity> optional = memberRepository.findByUsername(memberDTO.getUsername());
		
		//이거를 다른 메서드로 빼야하는것 같기도 하고?
		 if(optional.isPresent()) {
			 throw new RuntimeException("이미 존재하는 회원입니다.");
		 }
		 
		memberEntity.setUsername(memberDTO.getUsername());
		memberEntity.setPassword(memberDTO.getPassword());
		memberEntity.setName(memberDTO.getName());
		memberEntity.setBirthDate(memberDTO.getBirthDate());
		memberEntity.setPhoneNumber(memberDTO.getPhoneNumber());
		memberEntity.setEmail(memberDTO.getEmail());
		
		
		Date now = new Date();
		memberEntity.setCreateDate(now);
		memberEntity.setUpdateDate(now);
				
		memberEntity = memberRepository.save(memberEntity);
	
		return MemberDTO.toDto(memberEntity) ;
		
	}
	
	

	

}
