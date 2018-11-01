package com.groupware.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupware.user.domain.UserVO;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

	@Setter(onMethod_ = @Autowired)
	private com.groupware.user.mapper.UserMapper mapper;

	@Override
	public List<UserVO> getList() {
		// TODO Auto-generated method stub
		return mapper.getList();
	}

}
