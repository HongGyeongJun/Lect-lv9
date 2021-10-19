import controller.BankManager;

import models.Bank;

public class Main {
	public static void main(String[] args) {
		Bank.setName("Green");
		BankManager.instance.run();
	}

}
