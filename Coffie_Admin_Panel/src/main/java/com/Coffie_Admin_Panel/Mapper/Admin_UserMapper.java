package com.Coffie_Admin_Panel.Mapper;

import com.Coffie_Admin_Panel.Dto.Admin_UserDto;
import com.Coffie_Admin_Panel.Model.Admin_User;

public interface Admin_UserMapper {
public Admin_User EntitytoDto(Admin_UserDto admin_UserDto);
public Admin_UserDto DtotoEntity(Admin_User admin_User);
}
