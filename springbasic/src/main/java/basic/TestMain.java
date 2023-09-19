package basic;
public class TestMain {
	public static void main(String[] args) {
		//1. constructor를 이용하는 경우
		MemberDAO dao= new MemberDAO();
		//Insa insa = new InsaImpl(dao);
		
		//2. setter method를 이용하는 경우
		Insa insa = new InsaImpl();
		insa.setDao(dao);
		MemberDTO user = new MemberDTO("jang","1234","장동건");
		insa.addUser(user);

	}

}
