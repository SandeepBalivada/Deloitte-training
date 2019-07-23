package day7;

import java.io.*;

public class ConsoleInput {

	public static void main(String[] args) throws IOException {
		
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.println("Enter code name and salary:");
    int code = Integer.parseInt(br.readLine());
    String name = br.readLine();
    double salary = Double.parseDouble(br.readLine());
    System.out.println(code+" "+name+" "+salary);
    
	}

}
