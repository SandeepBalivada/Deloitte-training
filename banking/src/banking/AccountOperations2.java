package banking;

import java.util.ArrayList;

public class AccountOperations2 {
	ArrayList<Account> accounts = new ArrayList<>();
	static int i=7;
	public AccountOperations2()
	{
		accounts.add(new Account(15115,"Sandeep",55000.00));
		accounts.add(new Account(15116,"Sanjay",52000.00));
	}

	public void createAccount(String name)
	{
		int ano = 15110+i;
		accounts.add(new Account(ano,name,0.00));
		i++;
		System.out.println("New account added with name:"+name+" number:"+ano);
	}
	public void deposit(int acno, double amount)
	{
		int flag=0;
		   for(Account acn : accounts)
		   {
			   if(acn.getAccountNumber() == acno)
			   {
				   acn.setBalance(acn.getBalance()+amount);
				   System.out.println("Amount deposited. Current balance is : "+acn.getBalance());				    
				   flag++;
			   }
		   }
		   
		   try{
			   
			   if(flag==0)
				   throw new AccountNotExistException();
			   
		   }
		   catch(AccountNotExistException e)
		   {
			   System.out.println(e.getMessage());
		   }
	}
	public void withdraw(int acno, double amount)
	{
		int flag=0;
		   for(Account acn : accounts)
		   {
			   if(acn.getAccountNumber() == acno)
			   {
				   try{
				        if(acn.getBalance()<amount)
				         {
				        	throw new InsufficientBalanceException();
					     } 
				         acn.setBalance(acn.getBalance()-amount);
						 System.out.println("Amount withdrawn. Current balance is : "+acn.getBalance());
						 flag++;
				        
				      }
				   catch(InsufficientBalanceException e)
				     {
					   System.out.println(e.getMessage());	
					   flag++;
				     }
				  
			   }
		   }
		   
		   try{
			   
			   if(flag==0)
				   throw new AccountNotExistException();
			   
		   }
		   catch(AccountNotExistException e)
		   {
			   System.out.println(e.getMessage());
		   }
		   
	}
	public void display(int acno)
	{
		int flag=0;
		   for(Account acn : accounts)
		   {
			   if(acn.getAccountNumber() == acno)
			   {
				   System.out.println("Hello "+acn.getAccountName()+". Your account balance is:"+acn.getBalance());
				   flag++;
			   }
		   }
		   
		   try{
			   
			   if(flag==0)
				   throw new AccountNotExistException();
			   
		   }
		   catch(AccountNotExistException e)
		   {
			   System.out.println(e.getMessage());
		   }
		
	}
}
