package HashTable;
import java.util.*;
import java.io.*;

public class HashDemo {

	public static void main(String[] args) throws IOException {
     
		Hashtable<String,Integer> ht = new Hashtable<>();
		
		//add elements in Hashtabl
		ht.put("Saching Tendulkar", 120);
		ht.put("Virendra Sehwag",330);
		ht.put("Kapil Dev", 183);
		ht.put("Ajay Jadeza", 106);
		ht.put("Hardik Pandya", 91);
		
		//retrive elements using Enumerator		
		Enumeration<String> t = ht.keys();
		while(t.hasMoreElements())
		{
		System.out.println(t.nextElement()+"\t");
		}
		
		//now get the score on typing name of  Players
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name of Player");
		String name = br.readLine();
		name= name.trim();
		
		Integer score =ht.get(name);
		
		if(score!=null)
		{
			int sc = score.intValue();
			System.out.println(name +" \t"+"Score :"+sc);
		}else
		{
			System.out.println("Player Not Found");
		}
		
		
	}

}
