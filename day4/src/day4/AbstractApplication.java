package day4;

public class AbstractApplication extends TestAbstract {

	public static void main(String[] args) {
         TestAbstract abs = new TestAbstract();
         System.out.println(abs.x);
         abs.output();
	}
	@Override
	void output()
	{
		System.out.println("this is the most nearest one");
	}

}
