package annotation.basic;

import org.springframework.stereotype.Component;

@Component("customerdao")
public class CustomerDAO implements DAO {
	public CustomerDAO() {
		System.out.println("Default Constructor of CustomerDAO");
	}
	 
	@Override
	public void add(MemberDTO user) {
		System.out.println("CustomerDAO - ȸ������");
	}
	
	@Override
	public MemberDTO getUser(String id) {
		System.out.println("���̵�� ȸ�� ��ȸ�ϱ�");
		return null;
	}
}