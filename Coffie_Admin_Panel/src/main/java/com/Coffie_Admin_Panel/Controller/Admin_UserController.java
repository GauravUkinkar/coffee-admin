package com.Coffie_Admin_Panel.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Coffie_Admin_Panel.Dto.Admin_UserDto;
import com.Coffie_Admin_Panel.Dto.LoginDto;
import com.Coffie_Admin_Panel.Dto.Message;
import com.Coffie_Admin_Panel.Service.Admin_UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/Admin")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Log4j2
@RequiredArgsConstructor
public class Admin_UserController {
	
	public final Admin_UserService service;
	
	@PostMapping("/register")
	 public ResponseEntity<Message<Admin_UserDto>> addCompany(@RequestBody Admin_UserDto admin_UserDto) {
		Message<Admin_UserDto>message=service.registerUser(admin_UserDto);
		HttpStatus httpStatus = HttpStatus.valueOf(message.getStatus().value());
		return ResponseEntity.status(httpStatus).body(message);
	}

	@PostMapping("/login")
	public ResponseEntity<Message<Admin_UserDto>> loginUser(@RequestBody LoginDto loginDto) {
		Message<Admin_UserDto>message=service.loginUser(loginDto);
		HttpStatus httpStatus = HttpStatus.valueOf(message.getStatus().value());
		return ResponseEntity.status(httpStatus).body(message);
	}

}
