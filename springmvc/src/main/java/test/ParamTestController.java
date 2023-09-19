package test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ParamTestController {

	@RequestMapping("/showview")
	public String param() {
		return "main/param";
	}

	// get방식으로 /spingmvc/paramtest로 요청하는 경우 실행되는 method
	@RequestMapping(value = "/paramtest", method = RequestMethod.GET)
	public ModelAndView getparamtest(HttpServletRequest request, @RequestParam("data") String mydata, String info) {
		String data = request.getParameter("data");
		ModelAndView mav = new ModelAndView("main/paramresult");
		System.out.println("Request through GET type: " + data);
		System.out.println("Request through GET type: " + mydata);
		System.out.println("Request through GET type: " + info);
		mav.addObject("data", mydata);
		return mav;
	}

	// post방식으로 /spingmvc/paramtest로 요청하는 경우 실행되는 method
	@RequestMapping(value = "/paramtest", method = RequestMethod.POST)
	public ModelAndView postparamtest(@RequestParam String id, String pass) {
		ModelAndView mav = new ModelAndView("main/paramresult");
		System.out.println("Request through POST type");

		mav.addObject("id", id);
		mav.addObject("pass", pass);

		return mav;
	}// post방식으로 /spingmvc/paramtest로 요청하는 경우 실행되는 method

	@RequestMapping(value = "/paramtest2", method = RequestMethod.POST)
	public ModelAndView postparamtest2(TestDTO dto) {
		ModelAndView mav = new ModelAndView("main/paramresult");
		System.out.println("Request through POST type");
		System.out.println("DTO Obejct: "+dto);
		mav.addObject("id", dto.getId());
		mav.addObject("pass", dto.getPass());

		return mav;
	}

}
