package kr.co.tj.check;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "attendance")
public class CheckEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(nullable = false)
	private String username;

//	@Column(length = 200, nullable = false)
//	private String title;
//	
//	private String content;
	
	private LocalDateTime checkDate;
	

	
	
	

}
