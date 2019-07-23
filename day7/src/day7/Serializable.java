package day7;
import java.io.*;

public class Serializable {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("d:\\documents\\Student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Student std1 = new Student(101,"Sandeep",500);
			Student std2 = new Student(102,"Shashi",400);
			oos.writeObject(std1);
			oos.writeObject(std2);
			System.out.println("Success!!!");
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
