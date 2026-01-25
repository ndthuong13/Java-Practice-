package inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<Product> listProduct = new ArrayList<>();

	// add New Product
	public void addProduct(String name, String quantity) {
		listProduct.add(new Product(name, quantity));
	}

	// remove product by full detail
	public boolean removeProduct(String name) {
		listProduct.removeIf(listProduct -> listProduct.getName().equalsIgnoreCase(name));
		return true;
	}
	
	//display product list
	public void display() {
		if (!listProduct.isEmpty()) {
			for (Product p : listProduct) {
				System.out.println(p);
			}

		} else {
			System.out.println("List null");
		}

	}
}
