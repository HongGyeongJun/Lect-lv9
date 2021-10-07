package controller;

import java.util.ArrayList;

import models.Bank;
import models.User;

public class UserManager {

	public static UserManager instance = new UserManager();

	private UserManager() {
	}

	// user : ¡ﬂæ” (√—) µ•¿Ã≈Õ
	private ArrayList<User> user = new ArrayList<>();

	// ∞°¿‘
	public void joinUser() {

	}

	private int randomCode() {
		return 0;
	}

	public int login() {
		System.out.print("id : ");
		String id = Bank.scan.next();
		System.out.print("pw : ");
		String pw = Bank.scan.next();

		for (int i = 0; i < this.user.size(); i++) {
			if (user.get(i).getId().equals(id) && user.get(i).getId().equals(pw)) {
				return i;
			}
		}
		return -1;
	}
}
