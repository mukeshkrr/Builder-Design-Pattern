
public class BuilderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new Builder().setBattery(3000).setBrand("Samsung").setColor("Gold").setMemory(64).build();
		System.out.println(phone);

	}

}
