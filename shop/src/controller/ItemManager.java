package controller;

import java.util.Scanner;
import java.util.Vector;

import models.Cart;
import models.Item;
import models.User;

public class ItemManager {
	public static ItemManager instance;
	Scanner scan = new Scanner(System.in);
	Vector<String> category = new Vector<String>();
	Vector<Item> itemList = new Vector<Item>();
	Vector<Cart> cartList = new Vector<Cart>();

	public ItemManager() {
		init();
	}

	private void init() {
		category.add("����");
		category.add("����");
		category.add("����");
		category.add("�����");
		Item temp = new Item("�����", 1000, category.get(0));
		itemList.add(temp);
		temp = new Item("����", 2000, category.get(1));
		itemList.add(temp);
		temp = new Item("ĭ��", 3600, category.get(0));
		itemList.add(temp);
		temp = new Item("�Ұ��", 6500, category.get(2));
		itemList.add(temp);
		temp = new Item("�ݶ�", 500, category.get(3));
		itemList.add(temp);
		temp = new Item("����", 1800, category.get(1));
		itemList.add(temp);
	}

	public void printCart() {
		for (int i = 0; i < this.cartList.size(); i++) {
			this.cartList.get(i).print();
		}
	}

	public void printCart(User u) {
		for (int i = 0; i < this.cartList.size(); i++) {
			if (u.getId().equals(this.cartList.get(i).getUserId())) {
				this.cartList.get(i).print();
			}
		}
	}

	public void printCategory() {
		for (int i = 0; i < this.category.size(); i++) {
			System.out.println("[" + (i + 1) + "]" + this.category.get(i));
		}
	}

	public void printItemList() {
		for (int i = 0; i < this.itemList.size(); i++) {
			System.out.printf("[%d]", i + 1);
			this.itemList.get(i).print();
		}

	}

	public void printItemList(int Id) {
		int num = 1;
		for (int i = 0; i < this.itemList.size(); i++) {
			if (this.category.get(Id).equals(this.itemList.get(i).getCategory())) {
				System.out.printf("[%d]", num);
				this.itemList.get(i).print();
				num++;
			}
		}
	}
}
