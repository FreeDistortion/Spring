package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.playdata.erp.board.BoardDTO;
import com.playdata.erp.board.BoardService;

@Controller
public class IndexController {
	BoardService service;
	
	
	@Autowired
	public IndexController(BoardService service) {
		super();
		this.service = service;
	}

	@RequestMapping("/index.html")
	public String main(Model model) {
		//첫 page가 로딩될 때 필요한 data를 가져오기 위해 service 연결(board data)
		List<BoardDTO> list = service.findByCategory("게시판");
		model.addAttribute("boardlist",list);
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
