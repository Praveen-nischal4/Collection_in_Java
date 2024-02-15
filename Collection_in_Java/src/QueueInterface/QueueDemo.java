package QueueInterface;
import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
 
		Queue<Integer> lst = new LinkedList<>();
		
		//store elements in queue		
	for(int i=1;i<=5;i++)
	{
		lst.offer(i);
	}
		
		//retrieve elements of linkedlist
       System.out.println("ORiginal :"+lst);
       
       lst.poll();
       System.out.println("After deleted first element "+lst);
       
       
	}

}
