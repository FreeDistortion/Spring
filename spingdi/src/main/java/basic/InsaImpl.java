package basic;

public class InsaImpl implements Insa {
	MemberDAO dao;

	public InsaImpl() {
		System.out.println("Default Constructor of InsaImpl");
	}

	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("Constructor of InsaImpl with 1 parameter");
	}

	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);
	}

	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

	public MemberDAO getDao() {
		return dao;
	}

	@Override
	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}

}
