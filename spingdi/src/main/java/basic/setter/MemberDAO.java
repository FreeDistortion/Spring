package basic.setter;

public class MemberDAO implements DAO {
	public MemberDAO() {
		System.out.println("Default Constructor of MemberDAO");
	}
	
	@Override
	public void add(MemberDTO user) {
		System.out.println("ȸ������");
	}
	
	@Override
	public MemberDTO getUser(String id) {
		System.out.println("���̵�� ȸ�� ��ȸ�ϱ�");
		return null;
	}
}