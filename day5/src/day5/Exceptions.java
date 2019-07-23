package day5;

public class Exceptions {

	public static void main(String[] args) {
		int x=5;
		int y = 0;
		int arr[] = {3,4,5,6,7};
		try{
			
			int result = x/y;
			System.out.println(result);
			System.out.println(arr[35]);
		}
		catch(ArithmeticException | IndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}

	}

}
