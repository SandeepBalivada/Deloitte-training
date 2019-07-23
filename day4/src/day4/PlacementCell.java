package day4;

public class PlacementCell extends StudentExam {
     
	private boolean attended=true;
	private boolean selected=true;
	public static void main(String[] args) {
         PlacementCell pc = new PlacementCell();
         System.out.println(pc.regno+" "+pc.stdname+" "+pc.section+"\nAvg:");
	}

}
