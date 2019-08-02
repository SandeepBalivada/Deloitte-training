package hbncore;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class UpdateEmp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ssn = factory.openSession();
		/*Employee emp = (Employee) ssn.get(Employee.class, 144);
		emp.setEmpname("Raghav");
		emp.setSalary(40000);
		Transaction tx = ssn.beginTransaction();
		ssn.update(emp);
		tx.commit();
		System.out.println("updated");
*/
		/*Employee emp2 = (Employee) ssn.get(Employee.class, 144);
		Transaction tx = ssn.beginTransaction();
		ssn.delete(emp2);
		tx.commit();
		System.out.println("deleted");*/
		
		Query qry = ssn.createQuery("from Employee");
		List<Employee> empls = qry.list();
		for(Employee emp : empls)
			System.out.println(emp.getEmpcode()+" "+emp.getEmpname()+" "+emp.getSalary());
		ssn.close();

	}

}
