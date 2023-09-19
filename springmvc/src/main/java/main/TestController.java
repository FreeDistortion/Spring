package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/getdata")
	public ModelAndView getData() {
		ModelAndView mav = new ModelAndView();
		// ���� data ���� - request.setAttribute("name",������ü)
		mav.addObject("msg", "Spring���� �������� data.");
		
		// View ���� ���� - ��û�������� view �̸� ����
		mav.setViewName("main/result");

		return mav;
	}

	public TestController() {
		// TODO Auto-generated constructor stub
	}

}
