package task_02;

public class MotorCycle {
	
	private String id;
	private String manufacturer;
	private String model;
	private double netPrice;
	private int manufacturedYear;
	
	public MotorCycle(String id, String manufacturer, String model, double netPrice, int manufacturedYear) {
		this.id = id;
		this.manufacturer = manufacturer;
		this.model = model;
		this.netPrice = netPrice;
		this.manufacturedYear = manufacturedYear;
	}

	public String getId() {
		return id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public double getNetPrice() {
		return netPrice;
	}

	public int getManufacturedYear() {
		return manufacturedYear;
	}

	@Override
	public String toString() {
		return "MotorCycle [id=" + id + ", manufacturer=" + manufacturer + ", model=" + model + ", netPrice=" + netPrice
				+ ", manufacturedYear=" + manufacturedYear + "]";
	}
}
