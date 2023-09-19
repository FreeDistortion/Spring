package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GuGuController {

	@RequestMapping("/gugu")
	public ModelAndView printgugu() {
		ModelAndView mav = new ModelAndView();
		// 공유 data 저장 - request.setAttribute("name",공유객체)
		StringBuffer sb=new StringBuffer();
		for(int i=1;i<=9;i++){
		sb.append("7*"+i+"="+(7*i));
		}
		
		mav.addObject("dan", sb);
		
		// View 정보 설정 - 요청재지정할 view 이름 설정
		mav.setViewName("main/guguresult");

		return mav;
	}

}
