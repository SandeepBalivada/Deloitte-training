package day5;

@SuppressWarnings("serial")
public class SampleException extends Exception {
	public SampleException()
	{
		super("This is the exception form top");
	}

	public static void main(String[] args) {
		int age = 12;
		try{
			if(age<18)
				throw new SampleException();
			System.out.println("Eligible to vote");
		}
		catch(SampleException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
