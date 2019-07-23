package day5;

public class Aeroplane implements Vehicle{

	public static void main(String[] args) {
		Vehicle v1 = new Aeroplane();
		v1.wheels();
		v1.engines();
		

	}

	@Override
	public void wheels() {
		System.out.println("These are aeroplane wheels and their number is 10");
		
	}

	@Override
	public void engines() {
		System.out.println("This is an aeroplane engine and is more powerful than a car engine");
		
	}

}
