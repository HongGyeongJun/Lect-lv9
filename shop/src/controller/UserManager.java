package controller;

import java.util.Vector;

import models.Shop;
import models.User;

public class UserManager {
	public static UserManager instance = new UserManager();

	public Vector<User> users = new Vector<User>();

	private int log = -1;

	public UserManager() {

	}

	public int getLog() {
		return this.log;
	}

	public void setLog(int log) {
		this.log = log;
	}

	public void joinUser() {

		System.out.println("id : ");
		String id = Shop.scan.next();
		System.out.println("pw : ");
		String pw = Shop.scan.next();

		User temp = new User(id, pw, 0);

		this.users.add(temp);
		System.out.println(temp.getId() + "님 가입을 축하합니다.");

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
			System.out.println("아이디와 비밀번호를 다시 확인해 주세요.");
		} else {
			System.out.println("회원 탈퇴 되었습니다.");
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
			System.out.println("아이디와 비밀번호를 다시 확인해 주세요.");
		} else {
			System.out.println(users.get(this.log).getId() + "님 로그인");
			return true;
		}
		return false;
	}

	public void logOut() {
		if (this.log != -1) {
			System.out.println(users.get(this.log).getId() + "님 로그아웃");
			this.log = -1;
		}
	}

	public void printUser() {
		for (int i = 0; i < this.users.size(); i++) {
			System.out.printf("[%d]\n", i + 1);
			users.get(i).print();
		}
	}

	public void addUser() {

		System.out.println("id : ");
		String id = Shop.scan.next();
		System.out.println("pw : ");
		String pw = Shop.scan.next();

		User temp = new User(id, pw, 0);

		this.users.add(temp);

		System.out.println(temp.getId() + "님이 추가되었습니다.");

	}

	public void delUser() {
		while (true) {
			printUser();
			System.out.println("삭제하실 유저 번호를 입력하세요.");
			System.out.println("선택 : ");
			int sel = Shop.scan.nextInt();
			
			this.users.remove(sel - 1);
			System.out.println("삭제 완료.");
		}
	}
}