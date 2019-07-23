package day7;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class WriteFile {

	public static void main(String[] args) {
		
		File file = new File("d:\\documents");
		file.mkdir();
		try {
			FileOutputStream fos = new FileOutputStream("d:\\documents\\resume.txt");
			for(char x=65;x<=90;x++)
				fos.write(x);
			fos.close();
			
		} catch (IOException e){
			e.printStackTrace();
		}		

	}

}
