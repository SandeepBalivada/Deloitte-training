package banking;

public class AccountOperations{ 
	Account accounts[] = new Account[3];
		public AccountOperations() {
		    accounts[0] = new Account(10012,"Shashidhar",50000.00);
		    accounts[1] = new Account(10013,"Darshini",60000.00);
		    accounts[2] = new Account(10014,"Pavan",55000.00);
	       }

	   public void deposit(int acno,double amount)
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
	   
	   
	   public void withdraw(int acno,double amount)
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
					   flag++;
					   System.out.println(e.getMessage());	
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
