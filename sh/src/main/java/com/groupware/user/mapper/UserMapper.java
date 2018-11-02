package com.groupware.user.mapper;


import com.groupware.user.domain.LoginDTO;
import com.groupware.user.domain.UserVO;


public interface UserMapper {
	
	public void register(UserVO uservo);
	
	public UserVO login(LoginDTO loginDTO);


	
}
