import controller.BankManager;

import models.Bank;

public class Main {
	public static void main(String[] args) {

		// atm

		// 1. ȸ������/Ż��.
		// 2. �α���
		// 3. ���� ����/öȸ (ȸ���� 3�� ���� ����)
		// 4. ��ŷ��� (�Ա�/���/��ü/��ȸ)
		// 5. ����ó�� (����/�ε�)
		// 6. �����ڸ��(admin/0000 -> ��ü������ȸ/��ü������ȸ

		// models ��Ű�� �ȿ� ��üȭ �� Ŭ�������� ����
		// �� User
		// �� Account
		// �� Bank

		// controller ��Ű�� �ȿ� ��ü ó���� �� ���(�޼ҵ�) ����
		// �� UserManager (User Ÿ���� ��ü �迭)
		// �� AccountManager (Account Ÿ���� ��ü �迭)
		// �� BankManager
		// �� FileManager

		Bank.setName("Green");
		BankManager.instance.run();

	}

}
