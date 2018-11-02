package com.groupware.user.domain;


import java.util.Date;

import lombok.Data;

@Data
public class UserVO {

	private int userNum;
	private String userId;
	private String userPw;
	private String userName;
	private String address;
	private Date userJoinDate;
	
}