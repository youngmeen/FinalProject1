package com.groupware.commons;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.spi.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.groupware.user.service.UserServiceImpl;

import lombok.extern.log4j.Log4j;

@Log4j
public class LoginInterceptor extends HandlerInterceptorAdapter {

	private static final String LOGIN = "login";


	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		HttpSession httpSession = request.getSession();
		ModelMap modelMap = modelAndView.getModelMap();
		Object userVO = modelMap.get("user");

		if (userVO != null) {
			log.info("new login success");
			httpSession.setAttribute(LOGIN, userVO);
			httpSession.setAttribute("loginResult","SUCCESS");
			response.sendRedirect("/");
		}

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		HttpSession httpSession = request.getSession();
		// 기존의 로그인 정보 제거
		if (httpSession.getAttribute(LOGIN) != null) {
			log.info("clear login data before");
			httpSession.removeAttribute(LOGIN);
		}

		return true;
	}
}
