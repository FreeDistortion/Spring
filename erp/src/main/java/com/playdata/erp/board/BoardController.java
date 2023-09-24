package com.playdata.erp.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

	BoardService service;

	public BoardController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public BoardController(BoardService service) {
		super();
		this.service = service;
	}

	@GetMapping("/board/list")
	public String list(Model model, String category) {
		List<BoardDTO> boardlist = service.findByCategory(category);
		model.addAttribute("boardlist", boardlist);
		model.addAttribute("category",category);
		return "board/listview";
	}

	@GetMapping("/board/write")
	public String writePage() {

		return "board/writepage";
	}

	@PostMapping("/board/write")
	public String write(BoardDTO board) {
		service.insert(board);
		return "redirect:/board/list?category=all";
	}

	@GetMapping("/board/read")
	public ModelAndView read(String board_no, String cmd) {
		ModelAndView mav = null;
		if (cmd.equals("view")) {
			mav = new ModelAndView("board/read");
		} else {
			mav = new ModelAndView("board/update");
		}

		BoardDTO b = service.getBoardInfo(board_no);
		mav.addObject("board", b);
		return mav;
	}

	@PostMapping("/board/update")
	public String update(BoardDTO board) {
		service.update(board);
		return "redirect:/board/list?category=all";
	}
	
	@GetMapping("/board/delete")
	public String delete(String board_no) {
		service.delete(board_no);
		return "redirect:/board/list?category=all";
	}
	
	@PostMapping("/board/search")
	public ModelAndView search(String data) {
		ModelAndView mav=new ModelAndView("board/search");
		List<BoardDTO> list=service.search(data);
		mav.addObject("boardlist", list);
		return mav;
	}
}
