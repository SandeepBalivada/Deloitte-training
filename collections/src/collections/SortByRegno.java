package collections;
import java.util.Comparator;
public class SortByRegno implements Comparator<Student>{

	@Override
	public int compare(Student arg0, Student arg1) {
		int diff =  arg0.getRollno()-arg1.getRollno();
		return diff;
	}
	
	

}
