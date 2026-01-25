package inventory;

public class Product {
	private String name;
	private String quantity;

	public Product() {

	}

	public Product(String name, String quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [name: " + this.getName() + ", quantity: " + this.getQuantity() + "]";
	}

}
