package controller;

import models.Bank;

public class BankManager {

	private UserManager um = UserManager.instance;

	public static BankManager instance = new BankManager();

	private BankManager() {
	}

	public void run() {
		// ���� ����
		boolean isRun = true;
		while (isRun) {
			System.out.println(Bank.getName() + "ATM");
			printMenu();
			selectMenu();
		}
	}

	private void printMenu() {
		if (Bank.log == -1) {
			System.out.println("1.�α���\n2.ȸ������\n3.����");
		} else {
			System.out.println("1.�α׾ƿ�\n2.ȸ��Ż��\n3.���°���\n4.����öȸ");
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
					// ȸ������ �޼ҵ带 ȣ��
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
