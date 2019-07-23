package banking;

import java.util.Scanner;


public class BankApplication2 {

	public static void main(String[] args) {
		AccountOperations2 act = new AccountOperations2();
		int accountNumber;
		String accountName;
		double amount;
		Scanner scan = new Scanner(System.in);		
        int choiceFlag=0;
		while(choiceFlag==0)
		{
			System.out.println(" 1.Create Acccount \n 2.Deposit\n 3.Withdraw\n 4.Balance \n 5.Exit");
			System.out.println("Enter your choice:");
			int choice = scan.nextInt();
			scan.nextLine();
		
			switch(choice)
			{
			case 1:
				System.out.println("Enter name of the account holder:");
				accountName = scan.nextLine();
				act.createAccount(accountName);
				System.out.println("-----------------------------------------------------------");
				break;
		case 2:
			System.out.println("Enter account number:");
			accountNumber = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter amount to deposit:");
			amount = scan.nextDouble();
			scan.nextLine();
			act.deposit(accountNumber,amount);
			System.out.println("-----------------------------------------------------------");
			break;
		case 3:
			System.out.println("Enter account number:");
			accountNumber = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter amount to withdraw:");
			amount = scan.nextDouble();
			scan.nextLine();
			act.withdraw(accountNumber,amount);
			System.out.println("-----------------------------------------------------------");
			break;
		case 4:
			System.out.println("Enter account number:");
			accountNumber = scan.nextInt();
			scan.nextLine();
			act.display(accountNumber);
			System.out.println("-----------------------------------------------------------");
			break;
		case 5:
			System.out.println("Exited Application");
			choiceFlag=1;			
			System.out.println("-----------------------------------------------------------");
			break;
		
		default:
			System.out.println("Invalid choice");		
			System.out.println("-----------------------------------------------------------");
			
			
		}
      }
	   scan.close();
	
		

	}

}
