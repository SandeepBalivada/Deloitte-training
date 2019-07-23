package banking;

@SuppressWarnings("serial")
public class AccountNotExistException extends Exception {
	public AccountNotExistException()
	{
		super("The account does not exist here");
	}	

}
