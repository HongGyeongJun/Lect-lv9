package models;

import java.util.Scanner;

import controller.UserManager;

public class Shop {
	public static Scanner scan = new Scanner(System.in);

	public static Shop instance = new Shop();

	private UserManager um = UserManager.instance;

	private Shop() {
	}

	public void mainMenu() {

		boolean run = true;

		while (run) {
			System.out.println("1.[����]");
			System.out.println("2.[Ż��]");
			System.out.println("3.[�α���]");
			System.out.println("4.[�α׾ƿ�]");
			System.out.println("100.[������]");
			System.out.println("0.[����]");
			System.out.print("���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				um.joinUser();
			} else if (sel == 2) {
			} else if (sel == 3) {
				if (um.login()) {
					loginMenu();
				}
			} else if (sel == 4) {
			} else if (sel == 100) {
				managerMenu();
			} else if (sel == 0) {
				System.out.println("����.");
				run = false;
			} else {
				System.out.println("�������� �ʴ� �޴� �Դϴ�.");
			}
		}
	}

	private void managerMenu() {

		while (true) {

			System.out.println("1.[������ ����]");
			System.out.println("2.[ī�װ� ����]");
			System.out.println("3.[��ٱ��� ����]");
			System.out.println("4.[���� ����]");
			System.out.println("0.[�ڷΰ���]");
			System.out.print("���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				itemMenu();
			} else if (sel == 2) {
				categoryMenu();
			} else if (sel == 3) {
				fixCartMenu();
			} else if (sel == 4) {
				userMenu();
			} else if (sel == 0) {
				break;
			} else {
				System.out.println("�������� �ʴ� �޴� �Դϴ�.");
			}
		}
	}

	private void itemMenu() {
		while (true) {
			System.out.println("1.[��ü ������]");
			System.out.println("2.[������ �߰�]");
			System.out.println("3.[������ ����]");
			System.out.println("0.[�ڷΰ���]");
			System.out.print("���� : ");

			int sel = scan.nextInt();
			if (sel == 1) {
			} else if (sel == 2) {
			} else if (sel == 3) {
			} else if (sel == 0) {
				break;
			} else {
				System.out.println("�������� �ʴ� �޴� �Դϴ�.");
			}
		}
	}

	private void categoryMenu() {
		while (true) {
			System.out.println("1.[��ü ī�װ�]");
			System.out.println("2.[ī�װ� �߰�]");
			System.out.println("3.[ī�װ� ����]");
			System.out.println("0.[�ڷΰ���]");
			System.out.print("���� : ");
			int sel = scan.nextInt();
			if (sel == 1) {
			} else if (sel == 2) {
			} else if (sel == 3) {
			} else if (sel == 0) {
				break;
			} else {
				System.out.println("�������� �ʴ� �޴� �Դϴ�.");
			}
		}
	}

	private void fixCartMenu() {
		while (true) {
			System.out.println("1.[��ٱ��� ��ȸ]");
			System.out.println("2.[��ٱ��� �߰�]");
			System.out.println("3.[��ٱ��� ����]");
			System.out.println("0.[�ڷΰ���]");
			System.out.print("���� : ");
			int sel = scan.nextInt();
			if (sel == 1) {
			} else if (sel == 2) {
			} else if (sel == 3) {
			} else if (sel == 0) {
				break;
			} else {
				System.out.println("�������� �ʴ� �޴� �Դϴ�.");
			}
		}
	}

	private void userMenu() {
		while (true) {
			System.out.println("1.[��ü ����]");
			System.out.println("2.[���� �߰�]");
			System.out.println("3.[���� ����]");
			System.out.println("0.[�ڷΰ���]");
			System.out.print("���� : ");
			int sel = scan.nextInt();
			if (sel == 1) {
			} else if (sel == 2) {
			} else if (sel == 3) {
			} else if (sel == 0) {
				break;
			} else {
				System.out.println("�������� �ʴ� �޴� �Դϴ�.");
			}
		}
	}

	private void loginMenu() {
		boolean run = true;

		while (run) {
			System.out.println("1.[����]");
			System.out.println("2.[��ٱ��� ���]");
			System.out.println("0.[�ڷΰ���]");
			System.out.print("���� : ");

			int sel = scan.nextInt();

			if (sel == 1) {
				shopMenu();
			} else if (sel == 2) {
				cartMenu();
			} else if (sel == 0) {
				run = false;
			} else {
				System.out.println("�������� �ʴ� �޴� �Դϴ�.");
			}
		}
	}

	private void cartMenu() {
		boolean run = true;

		System.out.println("1.[�� ��ٱ���]");
		System.out.println("2.[����]");
		System.out.println("3.[����]");
		System.out.println("0.[�ڷΰ���]");
		System.out.print("���� : ");
		int sel = scan.nextInt();
		if (sel == 1) {
		} else if (sel == 2) {
		} else if (sel == 3) {
		} else if (sel == 0) {
			run = false;
		} else {
			System.out.println("�������� �ʴ� �޴� �Դϴ�.");
		}
	}

	private void shopMenu() {

	}
}
