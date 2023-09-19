package annotation.basic;

import org.springframework.stereotype.Component;

@Component("memberdao")
public class MemberDAO implements DAO {
	public MemberDAO() {
		System.out.println("Default Constructor of MemberDAO");
	}
	
	@Override
	public void add(MemberDTO user) {
		System.out.println("MemberDAO - 회원가입");
	}
	
	@Override
	public MemberDTO getUser(String id) {
		System.out.println("아이디로 회원 조회하기");
		return null;
	}
}