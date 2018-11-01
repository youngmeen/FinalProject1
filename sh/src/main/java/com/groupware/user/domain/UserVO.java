package com.groupware.user.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class UserVO {

	private String id; 
	private String pw;
	private String address;
	private String writer;
	private Date regdate;
	private Date updateDate;
	
	
}