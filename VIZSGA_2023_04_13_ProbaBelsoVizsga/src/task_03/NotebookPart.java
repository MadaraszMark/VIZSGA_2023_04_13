package task_03;

public class NotebookPart {

	private int id;
	private String name;
	private String accessionNumber;
	private String manufacturer;
	private String model;
	private int stockAmount;
	private int netPrice;
	private int shippingDay;
	
	public NotebookPart(int id, String name, String accessionNumber, String manufacturer, String model, int stockAmount,
			int netPrice) {
		this.id = id;
		this.name = name;
		this.accessionNumber = accessionNumber;
		this.manufacturer = manufacturer;
		this.model = model;
		this.stockAmount = stockAmount;
		this.netPrice = netPrice;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAccessionNumber() {
		return accessionNumber;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public int getNetPrice() {
		return netPrice;
	}

	public int getShippingDay() {
		return shippingDay;
	}

	public void setShippingDay(int shippingDay) {
		if (!(this.stockAmount > 0)) {
			this.shippingDay = 30;
		} else {
			this.shippingDay = shippingDay;
		}
	}

	@Override
	public String toString() {
		return "NotebookPart [id=" + id + ", name=" + name + ", accessionNumber=" + accessionNumber + ", manufacturer="
				+ manufacturer + ", model=" + model + ", stockAmount=" + stockAmount + ", netPrice=" + netPrice
				+ ", shippingDay=" + shippingDay + "]";
	}
}
