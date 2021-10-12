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
			System.out.println("1.[가입]");
			System.out.println("2.[탈퇴]");
			System.out.println("3.[로그인]");
			System.out.println("4.[로그아웃]");
			System.out.println("100.[관리자]");
			System.out.println("0.[종료]");
			System.out.print("선택 : ");
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
				fixCartMenu();
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
			} else if (sel == 2) {
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
			} else if (sel == 2) {
			} else if (sel == 3) {
			} else if (sel == 0) {
				break;
			} else {
				System.out.println("존재하지 않는 메뉴 입니다.");
			}
		}
	}

	private void fixCartMenu() {
		while (true) {
			System.out.println("1.[장바구니 조회]");
			System.out.println("2.[장바구니 추가]");
			System.out.println("3.[장바구니 삭제]");
			System.out.println("0.[뒤로가기]");
			System.out.print("선택 : ");
			int sel = scan.nextInt();
			if (sel == 1) {
			} else if (sel == 2) {
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
			} else if (sel == 2) {
			} else if (sel == 3) {
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
			System.out.println("0.[뒤로가기]");
			System.out.print("선택 : ");

			int sel = scan.nextInt();

			if (sel == 1) {
				shopMenu();
			} else if (sel == 2) {
				cartMenu();
			} else if (sel == 0) {
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
		} else if (sel == 2) {
		} else if (sel == 3) {
		} else if (sel == 0) {
			run = false;
		} else {
			System.out.println("존재하지 않는 메뉴 입니다.");
		}
	}

	private void shopMenu() {

	}
}
