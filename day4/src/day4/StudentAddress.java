package day4;

public class StudentAddress extends Student {
	private String city;
	public StudentAddress()
	{
		city = "Hyderabad";
	}
    void output()
    {
    	System.out.println(regno+stdname+section+city);
    }
	public static void main(String[] args) {
		StudentAddress sadd = new StudentAddress();
		sadd.output();
		sadd.display();

	}

}
