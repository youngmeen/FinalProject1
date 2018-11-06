package com.groupware.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.groupware.board.domain.BoardVO;
import com.groupware.board.service.BoardService;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class BoardController {

	@Autowired
	BoardService service;

	// 게시글 리스트
	@GetMapping("/boardList")
	public String list(Model model) {

		log.info("-----list-----");

		model.addAttribute("list", service.getList());
		log.info(service.getList());
		return "board/boardList";
	}

	// 게시글 쓸 수 있는 페이지 띄워주기
	@GetMapping("/boardRegister")
	public String register() {
		log.info("-----boardRegister-----");

		return "board/register";
	}

	// 게시글 입력 완료 후 DB에 등록하기 위한 mapping
	@PostMapping("/registerComplete")
	public String registerComplete(BoardVO board, RedirectAttributes rttr) {

		log.info("-----registerComplete-----");
		
		service.register(board);
		rttr.addFlashAttribute("result", board.getBno());
		
		return "redirect:/boardList";
	}

	// 게시글 자세히 보기
	@GetMapping("/get")
	public String get(@RequestParam("bno") Long bno, Model model) {

		log.info("-----get-----");
		model.addAttribute("board", service.read(bno));

		return "board/get";
	}

	// 수정하기 전 뷰를 띄워주기 위해서..
	@GetMapping("/getModify")
	public String modify(@RequestParam("bno") Long bno, Model model) {

		log.info("-----getModify-----");

		model.addAttribute("board", service.read(bno));

		return "board/modify";
	}

	// 수정 다하고 버튼 누르면 db업데이트 되고 list로 redirect됨..
	@PostMapping("/modify")
	public String modify(BoardVO board, RedirectAttributes rttr) {

		log.info("-----modify-----");

		if (service.modify(board)) {
			rttr.addFlashAttribute("result", "success");
		}

		return "redirect:/boardList";
	}

	@PostMapping("/remove")
	public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {

		log.info("-----remove-----");

		if (service.remove(bno)) {
			rttr.addFlashAttribute("result", "success");
		}

		return "redirect:/boardList";
	}
}
