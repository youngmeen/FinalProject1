package com.groupware.user.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.groupware.user.domain.LoginDTO;
import com.groupware.user.domain.UserVO;
import com.groupware.user.service.UserService;

import lombok.extern.log4j.Log4j;
import oracle.jdbc.driver.DatabaseError;

@Log4j
@Controller
@RequestMapping("/user")
public class UserController {

	@Inject
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void loginGET(@ModelAttribute("dto") LoginDTO dto) {

	}

	@RequestMapping(value = "/loginPost", method = RequestMethod.POST)
	public void loginPOST(LoginDTO dto, HttpSession session, Model model) throws Exception {

		UserVO vo = userService.login(dto);

		if (vo == null || !BCrypt.checkpw(dto.getUserPw(), vo.getUserPw())) {
			return;
		}

		model.addAttribute("userVO", vo);

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
