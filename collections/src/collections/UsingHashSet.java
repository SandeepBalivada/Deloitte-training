package collections;

import java.util.HashSet;
import java.util.TreeSet;
public class UsingHashSet {

	public static void main(String[] args) {
		HashSet items = new HashSet<>();
		items.add(456);
		items.add("Hyd");
		items.add(null);
		items.add(35.40);
		items.add(456);
		System.out.println(items);
		System.out.println("Using tree set:");
		TreeSet<String> values = new TreeSet<>();
		values.add("Chennai");
		values.add("Hyd");
		values.add("Roja");
		values.add("Bgl");
		values.add("xyz");
		System.out.println(values);
	}

}
