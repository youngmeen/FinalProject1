package com.groupware.board.mapper;

import java.util.List;

import com.groupware.board.domain.BoardVO;
import com.groupware.board.domain.Criteria;

public interface BoardMapper {
	public List<BoardVO>getList();
	
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
	
	public BoardVO read(Long bno);
	
	public int update(BoardVO board);
	
	public int delete(Long bno);
}
