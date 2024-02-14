package ArrayList;
import java.util.*;

public class DemoList {

	public static void main(String[] args) {
 
		ArrayList<String> arl = new ArrayList<String>();
		
		arl.add("Mango");
		arl.add("Lichi");
		arl.add("Papaya");
		arl.add("Apple");
		arl.add("Banana");
		
		System.out.println("Array List Elements :"+arl);
		
		arl.add(3, "Oranges");
		System.out.println("After adding at positob 3 List Element "+arl);
		
		arl.remove("Mango");
		System.out.println(arl);

		System.out.println(arl.contains("Apple"));
		
		System.out.println(arl.size());
		
		System.out.println("Extracting uisng ListIretator");
		
		ListIterator<String> t = arl.listIterator();
		while(t.hasNext())
		{
			String element = (String) t.next();
			System.out.println(element);
		}
		
	}

}
