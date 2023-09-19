package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostController {

	@RequestMapping(value = "/showform", method = RequestMethod.GET)
	public String showform() {
		return "main/PostForm";
	}
	
	@RequestMapping(value = "/showform", method = RequestMethod.POST)
	public ModelAndView showdata(PostDTO dto) {
		
		ModelAndView mav = new ModelAndView("main/postResult");
		mav.addObject("postdto",dto);
		return mav;
	}
	
	public PostController() {
		// TODO Auto-generated constructor stub
	}

}
