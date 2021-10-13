package models;

public class Cart {

	private String userId;
	private String itemName;

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void print() {
		System.out.printf("[%s]æ∆¿Ã≈€ : %s\n", this.userId, this.itemName);
	}

}
