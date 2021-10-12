package controller;

import java.util.ArrayList;
import java.util.Random;

import models.Shop;
import models.User;

public class UserManager {
	public static UserManager instance = new UserManager();

	private UserManager() {

	}

	private ArrayList<User> users = new ArrayList<>();

	public void joinUser() {
		System.out.println("id : ");
		String id = Shop.scan.next();
		System.out.println("pw : ");
		String pw = Shop.scan.next();

		boolean check = false;

		for (User user : this.users) {
			if (id.equals(user.getId())) {
				check = true;
			}
		}
		if (!check) {
			User newUser = new User(randomCode(), id, pw);
			this.users.add(newUser);
		} else {
			System.out.println("이미 존재하는 아이디 입니다.");
		}
	}

	private int randomCode() {
		Random ran = new Random();
		while (true) {
			int rCode = ran.nextInt(8999) + 1000;

			boolean check = false;
			for (User user : this.users) {
				if (rCode == user.getUserCode()) {
					check = true;
				}
			}
		}
	}

	public boolean login() {
		System.out.println("id : ");
		String id = Shop.scan.next();
		System.out.println("pw : ");
		String pw = Shop.scan.next();

		for (int i = 0; i < this.users.size(); i++) {
			if (this.users.get(i).getId().equals(id) && this.users.get(i).getPw().equals(pw)) {
				return true;
			}
		}
		return false;
	}
}
