package kr.co.tj.member;

import java.time.LocalDateTime;
import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberDTO {
	

	private String id;
	
	private String username;
		
	private String password;
	private String password2;
	private String orgPassword;
	
	private String name;
	
	private String birthDate;
	
	private String phoneNumber;
	
	private String email;

	private Date createDate;
	private Date updateDate;
	
	
	// dto -> entity
	public MemberEntity toEntity() {
		return MemberEntity.builder()
				.id(id)
				.username(username)
				.name(name)
				.password(orgPassword)
				.birthDate(birthDate)
				.phoneNumber(phoneNumber)
				.email(email)
				.createDate(createDate)
				.updateDate(updateDate)
				.build();
	}
	
	// entity -> dto
	public static MemberDTO toDto(MemberEntity memberEntity) {
		return MemberDTO.builder()
				.id(memberEntity.getId())
				.username(memberEntity.getUsername())
				.password(memberEntity.getPassword())
				.name(memberEntity.getName())
				.birthDate(memberEntity.getBirthDate())
				.phoneNumber(memberEntity.getPhoneNumber())
				.email(memberEntity.getEmail())
				.createDate(memberEntity.getCreateDate())
				.updateDate(memberEntity.getUpdateDate())
				.build();
		
	}
	
	

}
