package day4;

public class StudentExam extends Student{

	public static void main(String[] args) {
      int sub1 = 40;
      int sub2 = 56;
      int sub3 = 48;
      int total = sub1+sub2+sub3;
      double avg = total/3.0;
      StudentExam se = new StudentExam();
      System.out.println(se.regno+" "+se.stdname+" "+se.section+" "+"\ntotal:"+total+"\nAvg:"+avg);
	}

}
