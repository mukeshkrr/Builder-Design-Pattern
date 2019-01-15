
public class Phone {
	
	private String name;
	private String brand;
	private int battery;
	private int ram;
	private int memory;
	private String color;
	
	
	
	public Phone(String name, String brand, int battery, int ram, int memory, String color) {
		this.name = name;
		this.brand = brand;
		this.battery = battery;
		this.ram = ram;
		this.memory = memory;
		this.color = color;
	}



	@Override
	public String toString() {
		return "Phone [name=" + name + ", brand=" + brand + ", battery=" + battery + ", ram=" + ram + ", memory="
				+ memory + ", color=" + color + "]";
	}



	

}
