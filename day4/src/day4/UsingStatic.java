package day4;

public class UsingStatic {
    static int x=10;
    void display()
    {
    	x++;
    	System.out.println(x);
    }
	public static void main(String[] args) {
		x++;
		UsingStatic stat = new UsingStatic();
        stat.display();
	}

}
