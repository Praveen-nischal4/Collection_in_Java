package HashSetConcept;
import java.util.*;

public class Demo {


	public static void main(String[] args) {

		int capacity = 4;		
		HashSet<String> hs = new HashSet<String>(capacity);
		hs.add("Vanilla");
		hs.add("Strwaberry");
		hs.add("Chocolate");
		hs.add("Pista");
		hs.add("Keshw");
		hs.add("Kulfi");
		
	System.out.println(hs.size());
		if(!hs.isEmpty())
		{
		for(String i:hs)
		{
			System.out.println(i);
		}
		}
	}

}
