package com.groupware.user.domain;

import java.util.Date;


import lombok.Data;

@Data
public class UserVO {

	
	
	private String userId;
	
	private String userPw;
   
	private String userName;
	private Date userJoinDate;

}