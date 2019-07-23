package javafirst;

public class Accountapln {

	public static void main(String[] args) {
		Account acnt = new Account();
		acnt.setAcno(432325);
		acnt.setBalance(50000);
		acnt.setCustname("Sandeep");
		System.out.println(acnt.getAcno());
		System.out.println(acnt.getCustname());
		System.out.println(acnt.getBalance());
				

	}

}
