package kr.co.tj.member;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "members")
public class MemberEntity {
	
	@Id
	@GenericGenerator(strategy = "uuid", name = "id-uuid")
	@GeneratedValue(generator = "id-uuid")
	private String id;
	
	@Column(nullable = false, unique = true)
	private String username;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String name;
	
	private String birthDate;
	
	private String phoneNumber;
	
	private String email;

	
	private Date createDate;
	private Date updateDate;
	
	

}
