package collections;
import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList =  new ArrayList<>();
		studentList.add(new Student(101,"Sandeep"));
		studentList.add(new Student(102,"Sanju"));
		studentList.add(new Student(103,"Shashidhar"));
		for(Student std : studentList)
			System.out.println(std.getRollno()+" "+std.getName());
		
		
		
		
	}

}
