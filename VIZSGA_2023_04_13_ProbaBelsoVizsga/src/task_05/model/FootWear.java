package task_05.model;

public class FootWear {

	private int id;
	private String name;
	private String manufacturer;
	private String model;
	private float size;
	private int categoryId;
	private int netPrice;
	private boolean status;
	
	public FootWear(int id, String name, String manufacturer, String model, float size, int categoryId, int netPrice,
			boolean status) {
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.model = model;
		this.size = size;
		this.categoryId = categoryId;
		this.netPrice = netPrice;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public float getSize() {
		return size;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public int getNetPrice() {
		return netPrice;
	}

	public boolean isStatus() {
		return status;
	}

	public String getStatusText() {
		if (this.status) {
			return "Aktív";
		} else {
			return "Inaktív";
		}
	}
	
	@Override
	public String toString() {
		return "FootWear [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + ", model=" + model
				+ ", size=" + size + ", categoryId=" + categoryId + ", status=" + status + "]";
	}
}
