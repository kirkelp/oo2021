package Homework1;

import java.util.ArrayList;
import java.util.List;

public class Fridge {

	private List<Items> itemsList = new ArrayList<>();

	public void enter(Items items) {
		itemsList.add(items);
	}
	public void getItemsCount() {
		int count = 0;
		while (count < itemsList.size()) {
			count += 1;
		}
		System.out.println("In Fridge" + count + " items");
	}

	public void getItems() {
		for (int i = 0; i < itemsList.size(); i++) {
			System.out.println(itemsList.get(i).getType() + " " + itemsList.get(i).getName());
		}
	}
}