package day5;

public class LambdaExpression {

	public static void main(String[] args) {
		DefaultExampleInterface lbd = ()->{
			System.out.println("using lamda expression");
		};
		lbd.example();

	}

}
