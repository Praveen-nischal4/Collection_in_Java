package HashMapConcept;
import java.util.*;
import java.io.*;

public class HashDemo {

	
	public static void main(String[] args) throws IOException {

		HashMap<String,Long> hm = new HashMap<>();
		
		String name,str;
		Long phno;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("1: Enter Phone Entries");
			System.out.println("2: Look up in the Book");
			System.out.println("3: Display Name in th Book");
			System.out.println("4: Exit");
			
			
			System.out.println("Enter your choice");
			int n = Integer.parseInt(br.readLine());
			
			switch(n)
			{
			case 1:
				System.out.println("Enter name");
				name =br.readLine();
				System.out.println("Enter phone no");
				str =  br.readLine();
				phno = new Long(str);
				hm.put(name, phno);
				break;
				
			case 2:
				System.out.println("Enter name");
				name =br.readLine();
				name =name.trim();
			phno = hm.get(name);
			System.out.println("Phone :"+phno);
			break;
			
			case 3:
				Set<String> set = new HashSet<String>();
				set =hm.keySet();
				System.out.println(set);
				break;
			case 4:
				return;
				
		    }
	   }
   }
}
