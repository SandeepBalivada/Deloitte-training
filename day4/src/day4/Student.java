package day4;

public class Student {

		protected int regno;
		protected String stdname;
		protected String section;
		public Student()
		{
			regno=12345;
			stdname= "Sandeep";
			section = "4C";
		}
        public void display()
        {
        	System.out.println(regno+stdname+section);
        }

}
