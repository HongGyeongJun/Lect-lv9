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
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public User(int userCode, String id, String pw, String name, int accCnt) {
		this.userCode = userCode;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.setAccCnt(accCnt);
	}

	public String getId() {
		return this.id;
	}

	public String getPw() {
		return this.pw;
	}

	public int getUserCode() {
		return this.userCode;
	}

	public String getName() {
		return this.name;
	}

	public int getAccCnt() {
		return this.accCnt;
	}

	public void setAccCnt(int accCnt) {
		this.accCnt = accCnt;
	}

	@Override
	public String toString() {
		return this.userCode + ") " + this.id + "/" + this.pw + " : " + this.name;
	}

}
