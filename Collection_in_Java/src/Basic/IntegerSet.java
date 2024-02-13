package Basic;
import java.util.*;

public class IntegerSet {

	public static void main(String[] args) {
     
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		
		System.out.println(hs);    //retunr the object as [1,2,3,4,5,]
		
		for(Integer i :hs)            //retunr elments of object 
		{
			System.out.println(i);
		}
		
		System.out.println("----------------------------------->");
		
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			Integer f =(Integer) it.next();
			System.out.print(f+" ");
		}

	}

}
