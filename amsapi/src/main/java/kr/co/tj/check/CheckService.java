package kr.co.tj.check;

import java.time.LocalDateTime;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckService {
	
	@Autowired
	private CheckRepository checkRepository;

	// 기록은 하루에 2번 - 여러개가 찍히면 가장 처음/마지막만 유효 
	//insert아닌가?
	public CheckDTO checkTime(CheckDTO checkDTO) {
		
		
		CheckEntity checkEntity = checkDTO.toEntity();
		
		LocalDateTime now = LocalDateTime.now();
		checkEntity.setCheckDate(now);
		
		checkEntity = checkRepository.save(checkEntity);
		
		return CheckDTO.toDto(checkEntity);
		
	}


	
	
	

}
