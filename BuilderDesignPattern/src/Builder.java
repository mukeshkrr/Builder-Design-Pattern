
public final class Builder {
	
	private String name;
	private String brand;
	private int battery;
	private int ram;
	private int memory;
	private String color;
	
	public Builder setName(String name) {
		this.name = name;
		return this;
	}
	public Builder setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	public Builder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public Builder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public Builder setMemory(int memory) {
		this.memory = memory;
		return this;
	}
	public Builder setColor(String color) {
		this.color = color;
		return this;
	}
	
	
	public Phone build() {
		return new Phone( name,  brand,  battery,  ram,  memory,  color);
	}
	

}
