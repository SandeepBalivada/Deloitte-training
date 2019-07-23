package javafirst;
import java.util.*;

public class students {

	public static void main(String[] args) {
        int rollno,sub1,sub2,sub3,total;
        double average;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter roll no:");
        rollno = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter sub1 marks:");
       sub1= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter sub2 marks:");
        sub2= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter sub3 marks:");
        sub3= scan.nextInt();
        scan.nextLine();
        total = sub1+sub2+sub3;
        System.out.println("Total :" + total);
        average = total/3.0;
        System.out.println("Average:"+ average);
        if(sub1>=40 && sub2>=40 && sub3>=0 && average>=40)
        	System.out.println("Roll no:"+rollno+" has Passed");
        else
        	System.out.println("Roll no:"+rollno+" has Failed");
        
         scan.close();
        
	}

}
