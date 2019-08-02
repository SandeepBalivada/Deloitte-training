package one2one;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class One2OneMain {

	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ssn = factory.openSession();
		Transaction tx = ssn.beginTransaction();
		Applicant appl = new Applicant();
		appl.setName("Sandeep");
		appl.setAge(21);
		appl.setCity("Hyd");
		
		Passport pass = new Passport();
		pass.setPassportNumber("ABDF374");
		pass.setIssueDate(new Date());
		Calendar expiryDate = Calendar.getInstance();
		expiryDate.setTime(new Date());
		expiryDate.add(Calendar.YEAR, 10);
		pass.setExpiryDate(expiryDate.getTime());
		
		//relation mapping
		appl.setPassport(pass);
		pass.setApplicant(appl);
		//ssn.save(pass);
		ssn.save(appl);
		
		
		tx.commit();
		ssn.close();

	}

}
