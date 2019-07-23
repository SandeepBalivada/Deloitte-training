package day4;

public class MethodOverload {
	void add(int x,int y)
	{ System.out.println("int "+(x+y));
	}
	void add(double x,double y)
	{ System.out.println("double "+(x+y));
	}
	void add(String x,String y)
	{ System.out.println("String "+(x+y));
	}

	public static void main(String[] args) {
      MethodOverload load = new MethodOverload();
      load.add(5,6);
      load.add("Suresh ", "Ramesh");
	}

}
