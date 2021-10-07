package controller;

import models.Bank;

public class BankManager {

	private UserManager um = UserManager.instance;

	public static BankManager instance = new BankManager();

	private BankManager() {
	}

	public void run() {
		// 실행 시작
		boolean isRun = true;
		while (isRun) {
			System.out.println(Bank.getName() + "ATM");
			printMenu();
			selectMenu();
		}
	}

	private void printMenu() {
		if (Bank.log == -1) {
			System.out.println("1.로그인\n2.회원가입\n3.종료");
		} else {
			System.out.println("1.로그아웃\n2.회원탈퇴\n3.계좌개설\n4.계좌철회");
		}
	}

	private void selectMenu() {
		String input = Bank.scan.next();

		try {
			int sel = Integer.parseInt(input);

			if (Bank.log == -1) {
				if (sel == 1) {
					Bank.log = um.login();
				} else if (sel == 2) {
					// 회원가입 메소드를 호출
					um.joinUser();
				} else if (sel == 3) {
				}
			} else {
				if (sel == 1) {
					
				} else if (sel == 2) {
					
				} else if (sel == 3) {
					
				} else if (sel == 4) {
					
				}
			}
		} catch (Exception e) {

		}
	}
}
