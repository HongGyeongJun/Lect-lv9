package models;

public class User {

	private int userCode;
	private String id;
	private String pw;
	private String name;
	private int accCnt;

	// ���� ������ ��ü�ּ� �迭

	public User(int userCode, String id, String pw, String name) {
		this.userCode = userCode;
		this.setId(id);
		this.setPw(pw);
		this.name = name;
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

}
