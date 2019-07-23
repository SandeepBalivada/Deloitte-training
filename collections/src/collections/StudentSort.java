package collections;
import java.util.*;

public class StudentSort {

	public static void main(String[] args) {
		TreeSet<Student> tr = new TreeSet<>();
		tr.add(new Student(105,"Pavan"));
		tr.add(new Student(106,"Manoj gh "));
		for(Student std : tr)
			System.out.println(std.getRollno() + " "+std.getName());

	}

}
