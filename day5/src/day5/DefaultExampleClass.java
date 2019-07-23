package day5;

public class DefaultExampleClass implements DefaultExampleInterface{

	public static void main(String[] args) {
		
		DefaultExampleInterface de1 = new DefaultExampleClass();
		de1.defaultMethod();
		de1.example();
		DefaultExampleInterface.staticMethod();
 
	}

	@Override
	public void example() {
		System.out.println("This is interface method");
		
	}
	
	@Override
	public void defaultMethod()
	{
		System.out.println("This is overridden default");
	}

}
