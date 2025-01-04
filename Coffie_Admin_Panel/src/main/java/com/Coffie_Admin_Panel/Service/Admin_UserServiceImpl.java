package com.Coffie_Admin_Panel.Service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.Coffie_Admin_Panel.Dto.Admin_UserDto;
import com.Coffie_Admin_Panel.Dto.LoginDto;
import com.Coffie_Admin_Panel.Dto.Message;
import com.Coffie_Admin_Panel.Mapper.Admin_UserMapper;
import com.Coffie_Admin_Panel.Model.Admin_User;
import com.Coffie_Admin_Panel.Repository.Admin_UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class Admin_UserServiceImpl implements Admin_UserService {

	public final Admin_UserMapper mapper;
	public final Admin_UserRepository repository;

	@Override
	public Message<Admin_UserDto> registerUser(Admin_UserDto admin_UserDto) {
		Message<Admin_UserDto> message = new Message<>();
		log.info("User Registered Successfully");
		try {
			repository.save(mapper.EntitytoDto(admin_UserDto));
			message.setData(admin_UserDto);
			log.info("User Registered Successfully");
			message.setResponseMessage("User Registered Successfully");
			message.setStatus(HttpStatus.OK);

			return message;
		} catch (Exception e) {
			log.error(e.getMessage());
			message.setResponseMessage(e.getMessage());
			message.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
			return message;
		}

	}

	@Override
	public Message<Admin_UserDto> loginUser(LoginDto loginDto) {
		Message<Admin_UserDto> message = new Message<>();
		log.info("User Logged In Successfully");
		try {
			Admin_User user = repository.findByUsernameAndPassword(loginDto.getUsername(),
					loginDto.getPassword());
			if (user == null) {
				log.error("User Not Found");
				message.setResponseMessage("User Not Found");
				message.setStatus(HttpStatus.NOT_FOUND);
				return message;
			}
			message.setData(mapper.DtotoEntity(user));
			log.info("User Logged In Successfully" + user);
			message.setResponseMessage("User Logged In Successfully");
			message.setStatus(HttpStatus.OK);
			return message;
		} catch (Exception e) {
			log.error(e.getMessage());
			message.setResponseMessage(e.getMessage());
			message.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
			return message;
		}
	}

}
