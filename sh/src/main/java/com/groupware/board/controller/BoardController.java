package com.groupware.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.groupware.board.service.BoardService;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class BoardController {

	@Autowired 
	BoardService service;
	
	@GetMapping("/boardList")
	public String list(Model model) {
		
		log.info("-----list-----");
		
		model.addAttribute("list", service.getList());
		log.info(service.getList());
		return "board/boardMain";
	}

	@GetMapping("/get")
	public String get(@RequestParam("bno") Long bno, Model model) {
		
		log.info("-----get-----");
		model.addAttribute("board", service.get(bno));
		
		return "board/get";
	}
}
