package banking;

import java.util.Scanner;

public class BankApplication{

	
	public static void main(String[] args) {
		AccountOperations ac = new AccountOperations();
		int accountNumber;
		double amount;
		Scanner scan = new Scanner(System.in);		
        int choiceFlag=0;
		while(choiceFlag==0)
		{
			System.out.println("1.Deposit/n 2.Withdraw/n 3.Balance/n 4.Exit");
			System.out.println("Enter your choice:");
			int choice = scan.nextInt();
			scan.nextLine();
		
			switch(choice)
			{
		case 1:
			System.out.println("Enter account number:");
			accountNumber = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter amount to deposit:");
			amount = scan.nextDouble();
			scan.nextLine();
			ac.deposit(accountNumber,amount);
			break;
		case 2:
			System.out.println("Enter account number:");
			accountNumber = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter amount to withdraw:");
			amount = scan.nextDouble();
			scan.nextLine();
			ac.withdraw(accountNumber,amount);
			break;
		case 3:
			System.out.println("Enter account number:");
			accountNumber = scan.nextInt();
			scan.nextLine();
			ac.display(accountNumber);
			break;
		case 4:
			System.out.println("Exited Application");
			choiceFlag=1;			
			break;
		
		default:
			System.out.println("Invalid choice");		
			
		}
      }
	   scan.close();
	}

}
