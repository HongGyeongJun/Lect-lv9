package models;

import java.util.Scanner;

import controller.ItemManager;
import controller.UserManager;

public class Shop {
	public static Scanner scan = new Scanner(System.in);

	public static Shop instance = new Shop();

	private UserManager um = new UserManager();

	private ItemManager im = new ItemManager();

	private Shop() {
	}

	public void mainMenu() {

		boolean run = true;

		while (run) {
			System.out.println("1.[ȸ�� ����]");
			System.out.println("2.[�α���]");
			System.out.println("100.[������]");
			System.out.println("0.[����]");
			System.out.print("���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				um.joinUser();
			} else if (sel == 2) {
				if (um.login()) {
					loginMenu();
				}
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
				cartMenu();
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
				im.printItemList();
			} else if (sel == 2) {
				im.addItem();
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
				im.printCategory();
			} else if (sel == 2) {
				im.addCategory();
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
				um.printUser();
			} else if (sel == 2) {
				um.addUser();
			} else if (sel == 3) {
				um.delUser();
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
			System.out.println("3.[ȸ�� Ż��]");
			System.out.println("0.[�α׾ƿ�]");
			System.out.print("���� : ");

			int sel = scan.nextInt();

			if (sel == 1) {
				shopMenu();
			} else if (sel == 2) {
				cartMenu();
			} else if (sel == 3) {
				if (um.getLog() != -1) {
					um.delAcc();
					run = false;
				} else {
					continue;
				}
			} else if (sel == 0) {
				um.logOut();
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
			im.printCart(um.users.get(um.getLog()));
		} else if (sel == 2) {
		} else if (sel == 3) {
		} else if (sel == 0) {
			run = false;
		} else {
			System.out.println("�������� �ʴ� �޴� �Դϴ�.");
		}
	}

	private void shopMenu() {

		boolean run = true;
		while (run) {
			im.printCategory();
			System.out.println("ī�װ��� �Է��ϼ���.[���� : -1]");
			int cateId = scan.nextInt();
			if (cateId == -1) {
				break;
			}
			im.printItemList();
			System.out.println("������ ��ȣ�� �Է��ϼ���.");
			int itId = scan.nextInt();
			im.addCart(um.users.get(um.getLog()).getId(), cateId, itId);
		}

	}
}
