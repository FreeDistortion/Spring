package com.playdata.erp.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImple implements BoardService {

	BoardDAO dao;

	@Autowired
	public BoardServiceImple(BoardDAO dao) {
		super();
		this.dao = dao;
	}

	public BoardServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int insert(BoardDTO board) {
		// TODO Auto-generated method stub
		return dao.insert(board);
	}

	@Override
	public List<BoardDTO> boardList() {
		// TODO Auto-generated method stub
		return dao.boardList();
	}

	@Override
	public BoardDTO getBoardInfo(String board_no) {
		// TODO Auto-generated method stub
		return dao.read(board_no);
	}

	@Override
	public int update(BoardDTO board) {
		// TODO Auto-generated method stub
		return dao.update(board);
	}

	@Override
	public int delete(String board_no) {
		// TODO Auto-generated method stub
		return dao.delete(board_no);
	}

	@Override
	public List<BoardDTO> search(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDTO> search(String tag, String data) {
		// TODO Auto-generated method stub
		List<BoardDTO> list = null;
		list=dao.search(tag, data);
		
		return list;
	}

	// 전체 게시글 조회와 category별 조회를 하나의 service method에서 처리.
	@Override
	public List<BoardDTO> findByCategory(String category) {
		// TODO Auto-generated method stub
		List<BoardDTO> list = null;
		if (category != null) {
			if (category.equals("all")) {
				list = dao.boardList();
			} else {
				list=dao.findByCategory(category);
				
			}
		}
		return list;
	}

}
