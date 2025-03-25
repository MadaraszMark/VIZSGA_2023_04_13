package task_05.model;

public class FootWearCategory {

	private int id;
	private String name;
	
	public FootWearCategory(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "FootWearCategory [id=" + id + ", name=" + name + "]";
	}
}
