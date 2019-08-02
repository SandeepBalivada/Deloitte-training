package hbncore;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class CustomerAppln {

	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ssn = factory.openSession();
		Transaction tx = ssn.beginTransaction();
		Customer cust = new Customer();
		//cust.setCustid(155);
		cust.setCustname("Sandeepnew");
		ssn.save(cust);		
		tx.commit();
		ssn.close();
		System.out.println("Done with customer");
	}

}
