package annotation.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("insa")
public class InsaImpl implements Insa {
	//Member variable¿ª ≈Î«ÿ inject.
	@Autowired
	@Qualifier("customerdao")
	DAO dao;

	public InsaImpl() {
		System.out.println("Default Constructor of InsaImpl");
	}

	public InsaImpl(DAO dao) {
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

	public DAO getDao() {
		return dao;
	}

	@Override
	public void setDao(DAO dao) {
		this.dao = dao;
	}

}
