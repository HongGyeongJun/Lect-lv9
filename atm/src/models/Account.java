package models;

public class Account {

	public static int MAX = 3;

	// ���¹�ȣ, ����� �ڵ�, �ܾ�
	private int accNum;
	private int userCode;
	private int money;

	// ������
	public Account(int accNum, int userCode) {
		this.accNum = accNum;
		this.userCode = userCode;
		this.setMoney(5000); // welcome money
	}

	public Account(int accNum, int userCode, int money) {
		this.accNum = accNum;
		this.userCode = userCode;
		this.setMoney(money);
	}

	public int getAccNum() {
		return accNum;
	}

	public int getUserCode() {
		return userCode;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return this.accNum + "(" + this.userCode + ") : " + this.money + "��";
	}

}
