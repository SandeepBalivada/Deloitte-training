package day7;
import java.io.*;


public class Deserialize {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("d:\\documents\\Student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj;
			while((obj = ois.readObject()) != null){
				Student std = (Student) obj;
			    System.out.println(std.getId()+" "+std.getName()+" "+std.getMarks());
			}
			ois.close();
			fis.close();
			    
			
		} catch (IOException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		

	}

}
