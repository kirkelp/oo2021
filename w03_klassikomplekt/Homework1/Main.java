package Homework1;

public class Main {
    public static void main(String[] args) {

		Fridge fridge = new Fridge();

		Items item1 = new Items("Fruit", "Apple");
		Items item2 = new Items();
        item2.setType("Meat");
		item2.setName("Steak");
		

		fridge.enter(item1);
		fridge.enter(item2);
		
		fridge.getItems();
        fridge.getItemsCount();
		

	}

}
