package com.groupware.board.service;

import java.util.List;

import com.groupware.board.domain.BoardVO;

public interface BoardService {

	public List<BoardVO> getList();
	public BoardVO get(Long bno);
}
