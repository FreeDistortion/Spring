package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/getdata")
	public ModelAndView getData() {
		ModelAndView mav = new ModelAndView();
		// 공유 data 저장 - request.setAttribute("name",공유객체)
		mav.addObject("msg", "Spring에서 공유해준 data.");
		
		// View 정보 설정 - 요청재지정할 view 이름 설정
		mav.setViewName("main/result");

		return mav;
	}

	public TestController() {
		// TODO Auto-generated constructor stub
	}

}
