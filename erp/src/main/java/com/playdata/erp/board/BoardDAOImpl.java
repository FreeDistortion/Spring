package com.playdata.erp.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO{

	//MyBatis 핵심 class를 이용해 SQL command 살행
	SqlSession sqlSessionTemplate;
	
	@Autowired
	public BoardDAOImpl(SqlSession sqlSessionTemplate) {
		super();
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	public BoardDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int insert(BoardDTO board) {
		// TODO Auto-generated method stub
		// MyBatis의 insert method 내부에서 BoardDTO object의 getter method를 call 후 data를 꺼내서 같은 이름의 parameter 자리에 mapping 
		return sqlSessionTemplate.insert("com.playdata.erp.board.insert",board);
	}

	@Override
	public List<BoardDTO> boardList() {
		// TODO Auto-generated method stub
		// mapper file에 정의된 namespace+id가 sqlcommand를 찾는 key가 됨
		return sqlSessionTemplate.selectList("com.playdata.erp.board.selectall");
	}

	@Override
	public BoardDTO read(String board_no) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("com.playdata.erp.board.read", board_no);
	}

	@Override
	public int update(BoardDTO board) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.update("com.playdata.erp.board.update", board);
	}

	@Override
	public int delete(String board_no) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.delete("com.playdata.erp.board.delete", board_no);
	}

	@Override
	public List<BoardDTO> search(String data) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("com.playdata.erp.board.select", data);
	}

	@Override
	public List<BoardDTO> search(String tag, String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDTO> findByCategory(String category) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("com.playdata.erp.board.categorySelect", category);
	}
	
}
