package day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("d:\\documents\\resume.txt");
			int x;
			while((x=fis.read()) !=-1)
			{
				System.out.print((char)x);
			}
			fis.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
