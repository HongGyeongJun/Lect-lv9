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
			System.out.println("1.[회원 가입]");
			System.out.println("2.[로그인]");
			System.out.println("100.[관리자]");
			System.out.println("0.[종료]");
			System.out.print("선택 : ");
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
				System.out.println("종료.");
				run = false;
			} else {
				System.out.println("존재하지 않는 메뉴 입니다.");
			}
		}
	}

	private void managerMenu() {

		while (true) {

			System.out.println("1.[아이템 관리]");
			System.out.println("2.[카테고리 관리]");
			System.out.println("3.[장바구니 관리]");
			System.out.println("4.[유저 관리]");
			System.out.println("0.[뒤로가기]");
			System.out.print("선택 : ");
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
				System.out.println("존재하지 않는 메뉴 입니다.");
			}
		}
	}

	private void itemMenu() {
		while (true) {
			System.out.println("1.[전체 아이템]");
			System.out.println("2.[아이템 추가]");
			System.out.println("3.[아이템 삭제]");
			System.out.println("0.[뒤로가기]");
			System.out.print("선택 : ");

			int sel = scan.nextInt();
			if (sel == 1) {
				im.printItemList();
			} else if (sel == 2) {
				im.addItem();
			} else if (sel == 3) {
			} else if (sel == 0) {
				break;
			} else {
				System.out.println("존재하지 않는 메뉴 입니다.");
			}
		}
	}

	private void categoryMenu() {
		while (true) {
			System.out.println("1.[전체 카테고리]");
			System.out.println("2.[카테고리 추가]");
			System.out.println("3.[카테고리 삭제]");
			System.out.println("0.[뒤로가기]");
			System.out.print("선택 : ");
			int sel = scan.nextInt();
			if (sel == 1) {
				im.printCategory();
			} else if (sel == 2) {
				im.addCategory();
			} else if (sel == 3) {
			} else if (sel == 0) {
				break;
			} else {
				System.out.println("존재하지 않는 메뉴 입니다.");
			}
		}
	}

	private void userMenu() {
		while (true) {
			System.out.println("1.[전체 유저]");
			System.out.println("2.[유저 추가]");
			System.out.println("3.[유저 삭제]");
			System.out.println("0.[뒤로가기]");
			System.out.print("선택 : ");
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
				System.out.println("존재하지 않는 메뉴 입니다.");
			}
		}
	}

	private void loginMenu() {
		boolean run = true;

		while (run) {
			System.out.println("1.[쇼핑]");
			System.out.println("2.[장바구니 목록]");
			System.out.println("3.[회원 탈퇴]");
			System.out.println("0.[로그아웃]");
			System.out.print("선택 : ");

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
				System.out.println("존재하지 않는 메뉴 입니다.");
			}
		}
	}

	private void cartMenu() {
		boolean run = true;

		System.out.println("1.[내 장바구니]");
		System.out.println("2.[삭제]");
		System.out.println("3.[구입]");
		System.out.println("0.[뒤로가기]");
		System.out.print("선택 : ");
		int sel = scan.nextInt();
		if (sel == 1) {
			im.printCart(um.users.get(um.getLog()));
		} else if (sel == 2) {
		} else if (sel == 3) {
		} else if (sel == 0) {
			run = false;
		} else {
			System.out.println("존재하지 않는 메뉴 입니다.");
		}
	}

	private void shopMenu() {

		boolean run = true;
		while (run) {
			im.printCategory();
			System.out.println("카테고리를 입력하세요.[종료 : -1]");
			int cateId = scan.nextInt();
			if (cateId == -1) {
				break;
			}
			im.printItemList();
			System.out.println("아이템 번호를 입력하세요.");
			int itId = scan.nextInt();
			im.addCart(um.users.get(um.getLog()).getId(), cateId, itId);
		}

	}
}
