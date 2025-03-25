package task_04;

public class Product {

	private String id;
	private String name;
	private short categoryId;
	private int price;
	private int soldAmount;
	
	public Product(String id, String name, short categoryId, int price, int soldAmount) {
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
		this.price = price;
		this.soldAmount = soldAmount;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public short getCategoryId() {
		return categoryId;
	}

	public int getSoldAmount() {
		return soldAmount;
	}

	public int getPrice() {
		return price;
	}
	
	public String getCategoryText() {
		String text = "";
		switch(categoryId) {
		    case 1: text = "CSOKOR";
		    break;
		    case 2: text = "VIRÁGBOX";
		    break;
		    case 3: text = "CSEREPES";
		    break;
		}
		return text;
	}

	public boolean isIdLengthValid() {
		if (this.id.length()==8) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", categoryId=" + categoryId + ", price=" + price
				+ ", soldAmount=" + soldAmount + "]";
	}
	
	public String toStringDivider() {
		return String.format("%-15s %-28s %-20s %-15s %-15s", id, name, getCategoryText(), price + " Ft", soldAmount + " db");
	}
}
