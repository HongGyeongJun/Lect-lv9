package controller;

import models.Bank;

public class BankManager {

	public static BankManager instance = new BankManager();
	private UserManager um = UserManager.instance;
//	private boolean isRun = true;

	private BankManager() {

	}

	public void run() {
		boolean isRun = true;
		while (isRun) {
			System.out.println(Bank.getName() + " ATM");
			printMenu();
			isRun = selectMenu();
		}
	}

	private void printMenu() {
		if (Bank.log == -1) {
			System.out.println("1) 로그인");
			System.out.println("2) 회원가입");
			System.out.println("3) 종료");
		} else {
			System.out.println("1) 로그아웃");
			System.out.println("2) 입금");
			System.out.println("3) 출금");
			System.out.println("4) 이체");
			System.out.println("5) 조회");
			System.out.println("6) 계좌 개설");
			System.out.println("7) 계좌 철회");

		}
		if (Bank.log == 0) {
			System.out.println("8) 관리자");
		}
	}

	private boolean selectMenu() {
		String input = Bank.scan.next();

		try {

			int sel = Integer.parseInt(input);

			if (Bank.log == -1) {
				if (sel == 1) {
					Bank.log = um.login();
				} else if (sel == 2) {
					um.joinUser();
				} else if (sel == 3) {
					System.out.println("종료");
					return false;
				}
			} else {
				if (sel == 1) {
					um.logOut();
				} else if (sel == 2) {
				} else if (sel == 3) {
				} else if (sel == 4) {
				} else if (sel == 5) {
				} else if (sel == 6) {
				} else if (sel == 7) {
				}
			}
			if (sel == 8 && Bank.log == 0) {
				System.out.println("1) 전체 유저 조회");
				System.out.println("2) 전체 계좌 조회");
				System.out.println("3) 뒤로 가기");
			}
		} catch (Exception e) {
			System.out.println("입력값을 확인하세요.");
		}
		return true;
	}
}
