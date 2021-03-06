package vending;

public class VendingItem 
{
	private String name;
	private double  price;
	private int quantity;
	
	public VendingItem() {
		super();
	}

	public VendingItem(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public VendingItem(String nextLine) {
		String [] data=nextLine.split(",");
		name = data[0];
		price=Double.parseDouble(data[1]);
		quantity = Integer.parseInt(data[2]);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "VendingItem [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}
