package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GuGuController {

	@RequestMapping("/gugu")
	public ModelAndView printgugu() {
		ModelAndView mav = new ModelAndView();
		// ���� data ���� - request.setAttribute("name",������ü)
		StringBuffer sb=new StringBuffer();
		for(int i=1;i<=9;i++){
		sb.append("7*"+i+"="+(7*i));
		}
		
		mav.addObject("dan", sb);
		
		// View ���� ���� - ��û�������� view �̸� ����
		mav.setViewName("main/guguresult");

		return mav;
	}

}
