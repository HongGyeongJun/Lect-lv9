package controller;

import java.util.Vector;

import models.Shop;
import models.User;

public class UserManager {
	public static UserManager instance = new UserManager();

	private int log = -1;

	private UserManager() {

	}

	private Vector<User> users = new Vector<User>();

	public int getLog() {
		return this.log;
	}

	public void joinUser() {

		System.out.println("id : ");
		String id = Shop.scan.next();
		System.out.println("pw : ");
		String pw = Shop.scan.next();

		User temp = new User(id, pw, 0);

		this.users.add(temp);
		System.out.println(temp.getId() + "�� ������ �����մϴ�.");

	}

	public boolean delAcc() {
		System.out.println("id : ");
		String id = Shop.scan.next();
		System.out.println("pw : ");
		String pw = Shop.scan.next();

		for (int i = 0; i < this.users.size(); i++) {
			if (this.users.get(i).getId().equals(id) && this.users.get(i).getPw().equals(pw)) {
				this.users.remove(this.log);
				this.log = -1;
				break;
			}
		}
		if (this.log != -1) {
			System.out.println("���̵�� ��й�ȣ�� �ٽ� Ȯ���� �ּ���.");
		} else {
			System.out.println("ȸ�� Ż�� �Ǿ����ϴ�.");
			return true;
		}
		return false;
	}

	public boolean login() {
		System.out.println("id : ");
		String id = Shop.scan.next();
		System.out.println("pw : ");
		String pw = Shop.scan.next();

		for (int i = 0; i < this.users.size(); i++) {
			if (this.users.get(i).getId().equals(id) && this.users.get(i).getPw().equals(pw)) {
				this.log = i;
				break;
			}
		}
		if (this.log == -1) {
			System.out.println("���̵�� ��й�ȣ�� �ٽ� Ȯ���� �ּ���.");
		} else {
			System.out.println(users.get(this.log).getId() + "�� �α���");
			return true;
		}
		return false;
	}

	public void logOut() {
		if (this.log != -1) {
			System.out.println(users.get(this.log).getId() + "�� �α׾ƿ�");
			this.log = -1;
		}
	}

	public void printUser() {
		for (int i = 0; i < this.users.size(); i++) {
			System.out.printf("[%d]\n", i + 1);
			users.get(i).print();
		}
	}
}
