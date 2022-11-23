package com.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v")
public class ControllerCode {
	
	@GetMapping("/v2")
	public String Hello() {
		return "welcome venkatarao";
	}

}
