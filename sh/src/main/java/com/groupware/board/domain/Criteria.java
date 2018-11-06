package com.groupware.board.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author lsh
 *
 *	이 클래스는 검색의 기준이 되는 클래스입니다.
 */

@Getter
@Setter
@ToString
public class Criteria {
	
	private int pageNum;
	private int amount;
	
	public Criteria() {
		this(1,10);
	}
	
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
}
