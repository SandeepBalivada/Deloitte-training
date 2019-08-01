package web;

import org.springframework.stereotype.Component;

@Component
public class Student {
  private int regno;
  private String stdname;
  private int marks;
  public String getStdname() {
	return stdname;
}
public void setStdname(String stdname) {
	this.stdname = stdname;
}

public int getRegno() {
	return regno;
}
public void setRegno(int regno) {
	this.regno = regno;
}

public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
  
}
