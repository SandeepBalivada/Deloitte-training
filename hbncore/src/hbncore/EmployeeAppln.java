package hbncore;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class EmployeeAppln {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ssn = factory.openSession();
		Employee emp = new Employee();
		emp.setEmpcode(154);
		emp.setEmpname("Samar");
		emp.setSalary(5000);
		Transaction tx = ssn.beginTransaction();
		ssn.save(emp);
		tx.commit();
		ssn.close();
		System.out.println("inserted");

	}

}
