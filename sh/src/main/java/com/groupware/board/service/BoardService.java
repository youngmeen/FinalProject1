package com.groupware.board.service;

import java.util.List;

import com.groupware.board.domain.BoardVO;

public interface BoardService {

	public List<BoardVO> getList();
	public void register(BoardVO board);
	public BoardVO read(Long bno);
	public boolean modify(BoardVO board);
	public boolean remove(Long bno);
}
