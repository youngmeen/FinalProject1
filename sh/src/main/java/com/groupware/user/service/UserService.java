package com.groupware.user.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.groupware.user.domain.UserVO;

public interface UserService {
	
	void register(UserVO userVO) throws Exception;
	
	
}
