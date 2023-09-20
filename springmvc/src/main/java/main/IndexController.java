package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/index.html")
	public String index() {
		return "main/index";
	}
	
	@RequestMapping("/index")
	public String tiles_index() {
		System.out.println("tiles를 활용한 view 생성");
		return "index";//controller에서 return하는 view name은 tiles properties file에 등록한 <definition> element의 name 속성에 정의된 내용.
	}
	
	public IndexController() {
		
	}
	

}
