package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/index.do")
	public String main() {
		System.out.println("test");
		return "index";
	}

	@RequestMapping("/emp/login.do")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/menu/board.do")
	public String board(){
		return "menu/board";
	}
	
	public IndexController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
