package com.groupware.board.controller;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.groupware.board.mapper.BoardMapper;
import com.groupware.board.service.BoardService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class BoardController {

	@Autowired 
	BoardService service;
	
	@RequestMapping("/hi")
	public String boardmain() {
		
		
		return "board/boardMain";
	}

	//데이터베이스를 긁어오려면 Service를 이용해서 가져오기
	
	@GetMapping("/boardList")
	public String list(Model model) {
		
		log.info("-----list-----");
		
		model.addAttribute("list", service.getList());
		log.info(service.getList());
		return "board/boardMain";
	}

}
