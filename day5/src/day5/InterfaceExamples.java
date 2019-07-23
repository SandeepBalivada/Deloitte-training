package day5;

public class InterfaceExamples implements Sample1,Sample2{

	public static void main(String[] args) {
		Sample1 sa1 = new InterfaceExamples();
        sa1.methodOne();
		//InterfaceExamples ie = new InterfaceExamples();
		//ie.methodOne();
		//Sample2 sa2 = new InterfaceExamples();
        //sa2.methodTwo();
		//ie.methodTwo();
        Sample3 sa3 = new InterfaceExamples();
        sa3.methodThree();
	}

	@Override
	public void methodOne() {
		System.out.println("This is from method one and interface");
		
	}

	@Override
	public void methodTwo() {
		System.out.println("This is from method two and no interface");
		
	}

	@Override
	public void methodThree() {
		System.out.println("This is from method three and interface");
		
	}

}
