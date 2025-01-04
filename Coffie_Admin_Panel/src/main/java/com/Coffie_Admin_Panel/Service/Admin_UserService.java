package com.Coffie_Admin_Panel.Service;

import com.Coffie_Admin_Panel.Dto.Admin_UserDto;
import com.Coffie_Admin_Panel.Dto.LoginDto;
import com.Coffie_Admin_Panel.Dto.Message;

public interface Admin_UserService {
Message<Admin_UserDto> registerUser(Admin_UserDto admin_UserDto);
Message<Admin_UserDto> loginUser(LoginDto loginDto);
}
