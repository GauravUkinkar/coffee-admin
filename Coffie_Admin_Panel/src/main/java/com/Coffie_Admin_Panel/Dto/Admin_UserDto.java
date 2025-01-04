package com.Coffie_Admin_Panel.Dto;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@Accessors(chain = true)
public class Admin_UserDto {
	private int id;
	private String name;
	private String username;
	private String password;
}
