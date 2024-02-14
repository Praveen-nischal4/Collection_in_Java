package VectorConcept;
import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		
     Vector<Integer> v = new Vector<>();
     
     int x[] = {22,34,5,65,7,98,2,45,34};
     
     for(int i=0;i<x.length;i++)         //adding value of array into vector
     {
    	 v.add(x[i]);
     }
     
     for(int i=0;i<v.size();i++)
     {
    	 System.out.println(v.get(i));
     }
     
     //now retrieve elements using ListIterator
     
     ListIterator<Integer> lt = v.listIterator();
     System.out.println("Forward Direction ");
     
     while(lt.hasNext())
     System.out.print(lt.next()+"\t");
     System.out.println();
     System.out.println("Backward Direction");
     while(lt.hasPrevious())
    	 System.out.print(lt.previous()+"\t");
     
     
	}

}
