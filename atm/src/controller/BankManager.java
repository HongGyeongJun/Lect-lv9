package controller;

import models.Bank;

public class BankManager {

	private UserManager um = UserManager.instance;
	private FileManager fm = FileManager.instance;
	private AccountManager am = AccountManager.instance;

	public static BankManager instance = new BankManager();

	private BankManager() {
	}

	public void run() {
		// 실행 시작
		fm.load();
		boolean isRun = true;
		while (isRun) {
			System.out.println(Bank.getName() + "ATM");
			printMenu();
			isRun = selectMenu();
		}
		fm.save();
	}

	private void printMenu() {
		if (Bank.log == -1) {
			System.out.println("1.로그인\n2.회원가입\n3.종료");
		} else {
			System.out.println("1.입금\n2.출금\n3.이체\n4.조회\n5.계좌 개설\n6.계좌 철회\n7.로그아웃");
		}

		if (Bank.log == 0) {
			System.out.println("8.관리자");
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
					// 회원가입 메소드를 호출
					um.joinUser();
				} else if (sel == 3) {
					// 종료
					return false;
				}
			} else {
				if (sel == 1) {
					am.inputMoney();
				} else if (sel == 2) {
					am.outMoney();
				} else if (sel == 3) {
					am.withdraw();
				} else if (sel == 4) {
					am.printAccs();
				} else if (sel == 5) {
					am.createAcc();
				} else if (sel == 6) {
					am.deleteAcc();
				} else if (sel == 7) {
					Bank.log = -1;
				}
			}
			if (sel == 8 && Bank.log == 0) {
				System.out.println("1.전체 유저 조회\n2.전체 계좌 조회\n3.뒤로가기");
				selectAdmin();
			}
		} catch (Exception e) {
			System.out.println("입력값을 확인하세요.");
		}
		return true;
	}

	private void selectAdmin() {

		String input = Bank.scan.next();

		try {
			int sel = Integer.parseInt(input);
			if (sel == 1) {
				um.printAllData();
			} else if (sel == 2) {
				am.printAllData();
			} else if (sel == 3) {
				printMenu();
			}
		} catch (Exception e) {
		}
	}
}
