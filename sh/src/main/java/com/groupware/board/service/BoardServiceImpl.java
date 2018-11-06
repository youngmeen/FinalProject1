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
	public void register(BoardVO board) {
		
		log.info("BoardService.register()....");
		
		mapper.insertSelectKey(board);
	}
	
	@Override
	public BoardVO read(Long bno) {
		
		log.info("BoardService.get(Long bno)....");
		
		return mapper.read(bno);
	}	

	@Override
	public boolean modify(BoardVO board) {
		// TODO Auto-generated method stub
		log.info("modify..." + board);
	
		return mapper.update(board) == 1;
	}	
	
	@Override
	public boolean remove(Long bno) {
		log.info("remove.......");
		
		return mapper.delete(bno)==1;
	}
}
