package controller;

import java.util.ArrayList;
import java.util.Random;

import models.Bank;
import models.User;

public class UserManager {

	public static UserManager instance = new UserManager();

	public UserManager() {
	}

	private ArrayList<User> users = new ArrayList<>();

	public int login() {
		System.out.println("[로그인]");
		System.out.print("id : ");
		String id = Bank.scan.next();
		System.out.print("pw : ");
		String pw = Bank.scan.next();

		for (int i = 0; i < this.users.size(); i++) {
			if (this.users.get(i).getId().equals(id) && this.users.get(i).getPw().equals(pw)) {
				return i;
			}
		}
		return -1;

	}

	public void joinUser() {
		System.out.println("[회원가입]");
		System.out.print("id : ");
		String id = Bank.scan.next();
		System.out.print("pw : ");
		String pw = Bank.scan.next();
		System.out.print("이름 : ");
		String name = Bank.scan.next();

		boolean check = false;

		for (User user : this.users) {
			if (id.equals(user.getId())) {
				check = true;
			}
		}
		if (!check) {
			User newUser = new User(ranCode(), id, pw, name);
			this.users.add(newUser);
		} else {
			System.out.println("이미 존재하는 아이디 입니다.");
		}
	}

	private int ranCode() {
		Random ran = new Random();
		while (true) {
			int rCode = ran.nextInt(8999) + 1000;

			boolean check = false;
			for (User user : this.users) {
				if (rCode == user.getUserCode()) {
					check = true;
				}
			}
			if (!check) {
				return rCode;
			}
		}
	}

	public void logOut() {

		Bank.log = -1;
	}

	public void printAllData() {
		for (User user : this.users) {
			System.out.println(user);
		}
	}

	public User getUser(int index) {
		return this.users.get(index);
	}

	public int getUserSize() {
		return this.users.size();
	}

	public void addUser(User user) {
		this.users.add(user);
	}
}
