package kr.co.tj.check;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boards")
public class CheckController {
	
	@Autowired
	private CheckService checkService;
	
	@PostMapping("/check")
	private ResponseEntity<?> check(CheckDTO checkDTO){
		
		Map<String, Object> map = new HashMap<>();
		
		if(checkDTO == null) {
			throw new RuntimeException("문제 발생1");
		}
		
		System.out.println(checkDTO.toString());
		
		if(checkDTO.getUsername()==null) {
			throw new RuntimeException("문제 발생2" );
		}
		
		System.out.println(checkDTO.getUsername().toString());
		

		
		try {
			checkDTO = checkService.checkTime(checkDTO);
			map.put("result", checkDTO);
			return  ResponseEntity.ok().body(map);
			
		} catch (Exception e) {
			e.printStackTrace();
			map.put("result", e.getMessage());
			return ResponseEntity.badRequest().body("출결 기록 저장에 실패했습니다.");
		}
		
	}
	
	


}
