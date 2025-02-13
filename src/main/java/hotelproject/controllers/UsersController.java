package hotelproject.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hotelproject.repositories.vo.UserVo;
import hotelproject.services.UserService;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowried
	private UserService userservice;
	
	// 회원 가입
	@PostMapping("/signup")
	 public ResponseEntity<String> signUp(@RequestBody UserVo userVo) {
        // 이메일, 주민번호, 전화번호, 닉네임 중복 체크
        if (!userService.isEmailAvailable(userVo.getEmail())) {
            return ResponseEntity.badRequest().body("이미 사용 중인 이메일입니다.");
        }
        if (!userService.isSsnAvailable(userVo.getSsn())) {
            return ResponseEntity.badRequest().body("이미 가입된 주민번호입니다.");
        }
        if (!userService.isPhoneAvailable(userVo.getPhone())) {
            return ResponseEntity.badRequest().body("이미 사용 중인 전화번호입니다.");
        }
        if (!userService.isNicknameAvailable(userVo.getNickname())) {
            return ResponseEntity.badRequest().body("이미 사용 중인 닉네임입니다.");
        }
        // 추천인 유효성 체크
        if (userVo.getReferrer() != null && !userService.isReferrerValid(userVo.getReferrer())) {
            return ResponseEntity.badRequest().body("유효하지 않은 추천인입니다.");
        }
        
        return UserService.registerUser(userVo);
    }
    
    // 로그인
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserVo loginDto) {
        return UserService.authenticateUser(loginDto);
    }
}