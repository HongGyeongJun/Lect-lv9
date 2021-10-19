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
			System.out.println("1) �α���");
			System.out.println("2) ȸ������");
			System.out.println("3) ����");
		} else {
			System.out.println("1) �α׾ƿ�");
			System.out.println("2) �Ա�");
			System.out.println("3) ���");
			System.out.println("4) ��ü");
			System.out.println("5) ��ȸ");
			System.out.println("6) ���� ����");
			System.out.println("7) ���� öȸ");

		}
		if (Bank.log == 0) {
			System.out.println("8) ������");
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
					System.out.println("����");
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
				System.out.println("1) ��ü ���� ��ȸ");
				System.out.println("2) ��ü ���� ��ȸ");
				System.out.println("3) �ڷ� ����");
			}
		} catch (Exception e) {
			System.out.println("�Է°��� Ȯ���ϼ���.");
		}
		return true;
	}
}
