package com.groupware.board.mapper;

import java.util.List;

import com.groupware.board.domain.BoardVO;

public interface BoardMapper {
	public List<BoardVO>getList();
	public BoardVO get();
}
