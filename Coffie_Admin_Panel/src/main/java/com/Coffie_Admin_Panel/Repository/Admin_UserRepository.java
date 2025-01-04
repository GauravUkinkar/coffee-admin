package com.Coffie_Admin_Panel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Coffie_Admin_Panel.Model.Admin_User;

@Repository
public interface Admin_UserRepository extends JpaRepository<Admin_User, Integer> {

	Admin_User findByUsernameAndPassword(String username, String password);

}
