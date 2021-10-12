package models;

public class User {

	private int userCode;
	private String id;
	private String pw;

	public User(int userCode, String id, String pw) {
		this.userCode = userCode;
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return this.pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getUserCode() {
		return userCode;
	}

}
