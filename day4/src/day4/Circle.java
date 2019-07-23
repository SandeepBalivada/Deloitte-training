package day4;

public class Circle extends Shape{
	public Circle(int radius)
	{
		super(radius);
	}
 
   public static void main(String args[])
   {
	   Shape s1 = new Circle(25);
	   s1.area();
   }
   
   @Override
   public void area()
   {
	   System.out.println("Area of circle:"+ 3.14*radius*radius);
   }
}
