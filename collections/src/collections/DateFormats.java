package collections;
import java.util.Date;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateFormats {

	public static void main(String[] args) throws ParseException {
		
		String dob = "15-08-2019";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date date = sdf.parse(dob);
		System.out.println(date);
		sdf = new SimpleDateFormat("dd/MMMM/yyyy");
		System.out.println(sdf.format(date));
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.now().plusDays(4));
		
		

	}

}
