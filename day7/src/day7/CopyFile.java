package day7;

import java.io.*;

public class CopyFile {

	public static void main(String[] args) {
	   
       try {
		FileInputStream fis = new FileInputStream("D:\\documents\\resume.txt");
		FileOutputStream fos = new FileOutputStream("D:\\documents\\output.txt");
		int x;
		while((x=fis.read())!= -1)
			fos.write((char)x);
		fis.close();
		fos.close();
				
	} catch (IOException e) {
		e.printStackTrace();
	}
       
	}

}
