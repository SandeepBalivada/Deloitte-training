package inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InheritanceAppln {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ssn = factory.openSession();
		Book book = new Book();
		book.setBookid(111);
		book.setTitle("Services");
		book.setAuthor("Microsoft");
		book.setPrice(850);
		
		JavaBook java = new JavaBook();
		java.setBookid(112);
		java.setTitle("Java Services");
		java.setAuthor("Sandeep");
		java.setPrice(599);
		java.setDiscount(25);
		
		DotnetBook dot = new DotnetBook();
		dot.setBookid(115);
		dot.setTitle("Basic dotnet");
		dot.setAuthor("dotnet guys");
		dot.setPrice(299);
		dot.setCds(3);
		
		Transaction tx = ssn.beginTransaction();
		ssn.save(book);
		ssn.save(java);
		ssn.save(dot);
		
		tx.commit();
		ssn.close();
		System.out.println("done transaction");

	}

}
