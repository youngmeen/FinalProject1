package com.groupware.user.controller;


import javax.inject.Inject;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.groupware.user.domain.UserVO;
import com.groupware.user.service.UserService;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/user")
public class UserController {
	
	
	private final UserService userService;
	
	@Inject
	public UserController(UserService userService) {		
		this.userService = userService;
	}

	@RequestMapping("/login")
	public String login() {		
		return "user/login";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerGET() throws Exception {		
		return "user/register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPOST(UserVO userVO, RedirectAttributes redirectAttributes) throws Exception {		
		
		String hashedPw = BCrypt.hashpw(userVO.getUserPw(), BCrypt.gensalt());
		userVO.setUserPw(hashedPw);
		userService.register(userVO);
		redirectAttributes.addFlashAttribute("msg", "REGISTERD");
		
		return "redirect:/user/login";
	}
}
