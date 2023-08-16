package kr.co.tj.check;

import java.time.LocalDateTime;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CheckDTO {
	

	private String id;
	
	private String username;

//	private String title;
//	
//	private String content;
	
	private LocalDateTime checkDate;
	

	
	
	
	////
	
	//엔티티->DTO
	public static CheckDTO toDto(CheckEntity checkEntity) {
		return CheckDTO.builder()
				.id(checkEntity.getId())
				.username(checkEntity.getUsername())
				.checkDate(checkEntity.getCheckDate())
				.build();
	}
	
	//DTO->엔티티
	public CheckEntity toEntity() {
		return CheckEntity.builder()
				.id(id)
				.username(username)
				.checkDate(checkDate)
				.build();
	}
	
	
	
	
	

}
