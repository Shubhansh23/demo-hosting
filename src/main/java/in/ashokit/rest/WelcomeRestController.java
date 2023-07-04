package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMeg(){
		return new ResponseEntity<>("Welcome Shubhanshu Sharma",HttpStatus.OK);
	}
}
