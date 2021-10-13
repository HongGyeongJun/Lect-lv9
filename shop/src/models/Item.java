package models;

public class Item {
	private String name;
	private int price;
	private String category;

	public Item(String name, int price, String category) {
		this.setName(name);
		this.price = price;
		this.setCategory(category);
	}

	public void print() {
		System.out.println("[" + this.getName() + "]" + "[" + this.price + "]" + "[" + this.getCategory() + "]");
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
