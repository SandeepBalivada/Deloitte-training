package day5;

public class Car implements Vehicle{

	public static void main(String[] args) {
		Vehicle v1 = new Car();
		v1.wheels();
		v1.engines();

	}

	@Override
	public void wheels() {
		System.out.println("These wheels are for a car");
		
	}

	@Override
	public void engines() {
		System.out.println("This is a car engine");
		
	}

}
