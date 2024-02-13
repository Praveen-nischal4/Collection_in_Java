package Basic;
import java.util.*;

public class HashBasic {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>(); //group of string to be stored in HashSet
		hs.add("Soap");
		hs.add("Brush");
		hs.add("ToothPaste");
		hs.add("Face Wash");
		hs.add("Deo");
		
		hs.remove("Face Wash");
		System.out.println(hs);   // This will return an object of eleemnts
		
		for(String i :hs)
		{
			System.out.println(i);            //to retrieve eleemnts of HashSet
		}
		
		System.out.println("------------------------------>");
		Iterator it = hs.iterator();
		System.out.println("Elements of Iterator :");
		  {
			 while(it.hasNext())
			   {
			      String s = (String) it.next(); 
			      System.out.println(s);
		       }
		}
		
	}

}
