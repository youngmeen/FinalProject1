package com.groupware.user.service;

import com.groupware.user.domain.LoginDTO;
import com.groupware.user.domain.UserVO;

public interface UserService {

	public void register(UserVO userVO) throws Exception;

	public UserVO login(LoginDTO loginDTO) throws Exception;


}
