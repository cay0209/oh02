package kr.co.tj.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	

	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody MemberDTO memberDTO){
		
		Map<String, Object> map = new HashMap<>();
		
		if(memberDTO == null) {
			map.put("result", "입력한 정보가 적절한지 다시 확인해주세요.1");
		}
		
		if(memberDTO.getUsername() == null) {
			map.put("result", "입력한 정보가 적절한지 다시 확인해주세요.2");
		}
		
		
		if(memberDTO.getPassword() == null) {
			map.put("result", "입력한 정보가 적절한지 다시 확인해주세요.3");
		}
		
		if(memberDTO.getPassword2() == null) {
			map.put("result", "입력한 정보가 적절한지 다시 확인해주세요.4");
		}
		
		if(memberDTO.getPassword() != memberDTO.getPassword2()) {
			map.put("result", "입력한 정보가 적절한지 다시 확인해주세요.5");
		}
		
		if(memberDTO.getName() == null) {
			map.put("result", "입력한 정보가 적절한지 다시 확인해주세요.6");
		}
		
		if(memberDTO.getBirthDate() == null) {
			map.put("result", "입력한 정보가 적절한지 다시 확인해주세요.7");
		}
		
		if(memberDTO.getPhoneNumber() == null) {
			map.put("result", "입력한 정보가 적절한지 다시 확인해주세요.8");
		}
		
		if(memberDTO.getEmail() == null) {
			map.put("result", "입력한 정보가 적절한지 다시 확인해주세요.9");
		}
		

		
		try {
			memberDTO = memberService.create(memberDTO);
			map.put("result", memberDTO);
			return ResponseEntity.ok().body(map);
			
		} catch (Exception e) {
			e.printStackTrace();
			map.put("result", e.getMessage());
			return ResponseEntity.badRequest().body(map);
		}
		
	}
	
	
	
	
		
	

}
