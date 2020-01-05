package com.example.show.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServiceController {

	@GetMapping("/kakaoVideo")
	public String getKakaoService() {
		return "kakaoVideo";
	}
	@GetMapping("/kakaoBlog")
	public String getKakaoService2() {
		return "kakaoBlog";
	}
	@GetMapping("/youtube")
	public String youtube() {
		return "youtube";
	}
}