package collections;
import java.util.StringTokenizer;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class UsingStringTokenizer {

	public static void main(String[] args) throws ParseException {
		String str = "Hai Sasidhar, I know that,but do you know this, I will tell you";
		StringTokenizer strt = new StringTokenizer(str,",");
		while(strt.hasMoreTokens())
			System.out.println(strt.nextToken());
		Date today = new Date();
		System.out.println("Present date of System:"+today);
		
		String doj = "15/07/2019";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(doj);
		System.out.println("Date is:"+d);
		System.out.println(d.getDay());
		
		
	}

}
