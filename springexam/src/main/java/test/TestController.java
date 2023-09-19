package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/test")
	public String test() {
		return "basic/test";
	}
	
	public TestController() {
		// TODO Auto-generated constructor stub
	}

}
