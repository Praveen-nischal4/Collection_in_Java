package LinkedHAshConcept;
import java.util.*;

public class LinkedHash {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Comb");
		lhs.add("MAskra");
		lhs.add("Powder");
		lhs.add("Cream");
		lhs.add("Perfume");
		
		System.out.println(lhs);     //Array of Object
		System.out.println(lhs.contains("Powder"));
		
		for(String i : lhs)
		{
			System.out.println(i);
		}
		System.out.println("-----------------------");
		Iterator it = lhs.iterator();
		while(it.hasNext())
		{
			String i =(String) it.next();
			System.out.println(i);
		}

	}

}
