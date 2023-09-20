package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TilesTestController {
	
	@RequestMapping("/tiles/post")
	public String showPostView() {
		return "postview";
	}
	
	@RequestMapping("/tiles/login")
	public String tilesLogin() {
		return "tiles/login";
	}
	
	@RequestMapping("/tiles/insert")
	public String tilesInsert() {
		return "tiles/insert";
	}
}
