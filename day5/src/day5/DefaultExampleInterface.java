package day5;

public interface DefaultExampleInterface {
	void example();
	default void defaultMethod() {
		System.out.println("This is from interface default");
	}
	static void staticMethod() {
		System.out.println("This is from interface static");
	}
	

}
