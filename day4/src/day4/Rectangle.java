package day4;

public class Rectangle extends Shape{
	public Rectangle(int length,int breadth)
	{
		super(length,breadth);
	}
	
	public static void main(String args[])
	{
		Shape s = new Rectangle(30,40);
		s.area();
	}
	
    @Override
   public void area()
    {
    	System.out.println("Area of rectangle:"+length*breadth);
    }
}
