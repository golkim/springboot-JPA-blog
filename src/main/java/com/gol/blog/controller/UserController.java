package com.gol.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//인증이 안된 사용자들이 출입할수 있는 경로는 /auth/* 허용
// 그냥 주소가 / 이면 index.jsp허용, static 이하에 있는 /js/*, /css/*, /image/* 허용

@Controller
public class UserController {

	@GetMapping("/auth/joinForm")
	public String joinForm() {
		return"user/joinForm";
	}
	@GetMapping("/auth/loginForm")
	public String loginForm() {
		return"user/loginForm";
	}
}
