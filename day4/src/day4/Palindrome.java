package day4;

public class Palindrome {
	public static void main(String args[])
	{
		String name = "madam";
		StringBuffer sb = new StringBuffer(name);
		sb.reverse();
		String dummy = sb.toString();
		//System.out.println(dummy.compareTo(name));
		if(dummy.compareTo(name)==0)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
		
		
		
	}

}
