package com.groupware.user.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupware.user.domain.LoginDTO;
import com.groupware.user.domain.UserVO;
import com.groupware.user.mapper.UserMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

	@Setter(onMethod_ = @Autowired)
	private UserMapper mapper;

	@Override
	public void register(UserVO userVO) throws Exception {

		mapper.register(userVO);
	}

	@Override
	public UserVO login(LoginDTO loginDTO) throws Exception {
		return mapper.login(loginDTO);
	}

}
