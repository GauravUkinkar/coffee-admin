package com.Coffie_Admin_Panel.Mapper;

import org.springframework.stereotype.Component;

import com.Coffie_Admin_Panel.Dto.Admin_UserDto;
import com.Coffie_Admin_Panel.Model.Admin_User;
@Component
public class Admin_UserMapperImpl implements Admin_UserMapper {

	@Override
	public Admin_User EntitytoDto(Admin_UserDto admin_UserDto) {
		return new Admin_User()
				.setId(admin_UserDto.getId())
				.setName(admin_UserDto.getName())
				.setPassword(admin_UserDto.getPassword())
				.setUsername(admin_UserDto.getUsername());
	}

	@Override
	public Admin_UserDto DtotoEntity(Admin_User admin_User) {
		return new Admin_UserDto()
				.setId(admin_User.getId())
				.setName(admin_User.getName())
				.setPassword(admin_User.getPassword())
				.setUsername(admin_User.getUsername());
	}

}
