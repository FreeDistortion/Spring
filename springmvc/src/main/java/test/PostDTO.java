package test;

public class PostDTO {
	// param으로 넘기는 data의 name값과 같아야 함.
	private String userId;
	private String passwd;
	
	
	public PostDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PostDTO(String userId, String passwd) {
		super();
		this.userId = userId;
		this.passwd = passwd;
	}


	@Override
	public String toString() {
		return "PostDTO [userId=" + userId + ", passwd=" + passwd + "]";
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getPasswd() {
		return passwd;
	}


	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}
