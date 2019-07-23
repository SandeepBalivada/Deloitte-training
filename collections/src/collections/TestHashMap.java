package collections;
import java.util.*;


public class TestHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> phoneBook = new HashMap<>();
		phoneBook.put("Sandeep", 94935);
		phoneBook.put("Sanjay", 58284);
		System.out.println(phoneBook);
		Set set = phoneBook.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		

	}

}