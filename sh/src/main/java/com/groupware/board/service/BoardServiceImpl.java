package com.groupware.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupware.board.domain.BoardVO;
import com.groupware.board.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@Service
public class BoardServiceImpl implements BoardService{
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> getList() {
		
		log.info("BoardService.getList()....");
		
		return mapper.getList();
	}
	
	@Override
	public BoardVO get(Long bno) {
		
		log.info("BoardService.getList()....");
		
		return mapper.get();
	}
}
