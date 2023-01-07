package com.gol.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

//사용자가 요청 -> 응답(Data)
@RestController
public class HttpControllerTest {
	
//	읽기
//	http://localhost:8080/http/get
	@GetMapping("/http/get")
	public String getTest() {
		return "get 요청";
	}
//	쓰기
//	http://localhost:8080/http/post
	@PostMapping("/http/post")
	public String postTest() {
		return "post 요청";
	}
//	수정
//	http://localhost:8080/http/put
	@PutMapping("/http/put")
	public String putTest() {
		return "put 요청";
	}
//	삭제
//	http://localhost:8080/http/delete
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
}
