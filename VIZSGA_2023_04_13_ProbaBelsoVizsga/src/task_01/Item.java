package task_01;

public class Item {

	private String accessionNumber;
	private String name;
	private int netPrice;
	private int stockAmount;
	private boolean available;
	private boolean sale;
	
	public Item(String name, int netPrice, int stockAmount, boolean available, boolean sale) {
		this.name = name;
		this.netPrice = netPrice;
		this.stockAmount = stockAmount;
		this.available = available;
		this.sale = sale;
	}

	public String getAccessionNumber() {
		return accessionNumber;
	}

	public String getName() {
		return name;
	}

	public int getNetPrice() {
		return netPrice;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public boolean isAvailable() {
		return available;
	}

	public boolean isSale() {
		return sale;
	}

	public void setAccessionNumber(String accessionNumber) {
		this.accessionNumber = accessionNumber;
	}

	@Override
	public String toString() {
		return "Item [accessionNumber=" + accessionNumber + ", name=" + name + ", netPrice=" + netPrice
				+ ", stockAmount=" + stockAmount + ", available=" + available + ", sale=" + sale + "]";
	}
}
