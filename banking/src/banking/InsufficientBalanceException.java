package banking;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException()
	{
		super("Balance is insufficient");
	}

}
