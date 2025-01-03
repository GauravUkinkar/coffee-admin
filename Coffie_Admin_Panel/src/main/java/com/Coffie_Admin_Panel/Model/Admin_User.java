package com.Coffie_Admin_Panel.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Entity
@ToString
@Accessors(chain = true)
public class Admin_User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String password;


}
