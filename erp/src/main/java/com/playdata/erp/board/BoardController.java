package com.playdata.erp.board;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

@Controller
public class BoardController {

	BoardService service;
	FileUploadLogicService fileUploadService;

	public BoardController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public BoardController(BoardService service, FileUploadLogicService fileUploadService) {
		super();
		this.service = service;
		this.fileUploadService = fileUploadService;
	}



	@GetMapping("/board/list")
	public String list(Model model, String category) {
		List<BoardDTO> boardlist = service.findByCategory(category);
		model.addAttribute("boardlist", boardlist);
		model.addAttribute("category", category);
		return "board/listview";
	}

	@GetMapping("/board/write")
	public String writePage() {

		return "board/writepage";
	}

	@PostMapping("/board/write")
	public String write(BoardDTO board, HttpSession session) throws IllegalStateException, IOException {
		// System.out.println("************board: "+board+"************");

		// 1. MultipartFile 정보 추출
		List<MultipartFile> files = board.getFiles();

		// 2. Export server path be uploaded
		// -> 실제 server path exportation을 위해 context object의 정보를 담고있는 ServletContext
		// object를 추출.
		// -> ServletContext가 web site(project)에 대한 정보를 담고 있는 object이고, 실제 경로를 구살 수 있는
		// method가 있다.
		// Spring 내부에서 처리할 수 있도록 ServletContext object를 만들어 전달.
		String path = WebUtils.getRealPath(session.getServletContext(), "/WEB-INF/upload");

//		System.out.println("!!!!!!!!!!!!!!!!!THE REAL PATH OF SERVER!!!!!!!!!!!!!!!!!");
//		System.out.println(path);

		// 3. Upload 처리 - logic을 구현해서 실제 server path에 upload 되도록 처리.
		List<BoardFileDTO> boardFileDTOList = fileUploadService.uploadFiles(files, path);

		// 4. 게시글에 대한 일반적인 내용과, 첨부 파일이 있는 경우 해당 정보를 담은 List를 DB에 저장할 수 있도록 넘기기.
		service.insert(board,boardFileDTOList);
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
		List<BoardFileDTO> boardFileDTOList= service.getFileList(board_no);
		mav.addObject("board", b);
		mav.addObject("boardFileDTOList", boardFileDTOList);
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
	public ModelAndView search(String search, String tag) {
		ModelAndView mav = new ModelAndView("board/search");
		List<BoardDTO> list = service.search(tag, search);
		System.out.println(list);
		mav.addObject("boardlist", list);
		return mav;
	}
}
