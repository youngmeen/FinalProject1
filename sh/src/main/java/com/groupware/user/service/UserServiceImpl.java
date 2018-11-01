package com.groupware.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		// TODO Auto-generated method stub

		mapper.register(userVO);
	}

}
