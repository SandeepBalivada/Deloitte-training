package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestArrayList {

	public static void main(String[] args) {
       ArrayList items = new ArrayList();
       items.add(345);
       items.add("Sandeep");
       items.add(67.34);
       System.out.println(items+" "+items.size());
       items.add(1,"Sanju"); 
       System.out.println(items+" "+items.size());
       items.remove(new String("Sanju"));
       ListIterator it = items.listIterator();
       while(it.hasNext())
    	   System.out.println(it.next());
       ListIterator itr = items.listIterator();
       /*items obj = new itr.hasNext();
       while(itr.hasNext())
    	   if(itr instanceOf Integer )*/ 
               
    		   
       
       
	}

}
