package javafirst;
import java.util.Scanner;
public class AccountArrays {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter your code , name and salary:");
		 int code = scan.nextInt();
		 scan.nextLine();
		 String name = scan.nextLine();
		 double sal = scan.nextDouble();
		 System.out.println(code+" "+name+" "+sal);
		 scan.close();
		 
		 Account accounts[] = new Account[3];
		 accounts[0] = new Account(101,"Sandeep",50000);
		 accounts[1] = new Account(102,"Sanath",50000);
		 accounts[2] = new Account(103,"Naresh",50000);
		 		 		 
	}

}
