package LinkedListConcept;
import java.util.*;
import java.io.*;
public class Demo {

	public static void main(String[] args) throws NumberFormatException, IOException {
     
		LinkedList<String> ll = new LinkedList<>();   //empty linkedlist
		
		ll.add("Pen");
		ll.add("Fountain Pen");
		ll.add("Dot Pen");
		ll.add("Ball Pen");
		ll.add("Gel Pen");
		ll.add("Glitter Pen");
		ll.add("Sprakal Pen");
		
		System.out.println("List :"+ll);        //display elements in LinkedList
		
		ll.add(3,"Light Pen");
		System.out.println("List :"+ll);    // display after adding at position 3
		
		ll.addFirst("MyPen");
		System.out.println("List :"+ll);     // display after adding at element at first position
		
		ll.addLast("YourPen");
		System.out.println("List :"+ll);     // display after adding at element at last position
		
		ll.remove("Ball Pen");
		System.out.println("List : "+ll);     //display after removing  element
		
		ll.removeFirst();
		System.out.println("List : "+ll);    //display after removing at !st position
		
		ll.removeLast();		
		System.out.println("List : "+ll);    //display after removing at last position
		
		ll.remove(4);		
		System.out.println("List : "+ll);    //display after removing at specified position
		
		int choice = 0,pos;
	    String element;
	    
		System.out.println();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(choice <4)
		{
			
			
			System.out.println("1: Get Element at specific Position");
			System.out.println("2: Get element at Last Position");
			System.out.println("3: Set element at Definate Position");
			System.out.println("4: Size of Linked List ");
			System.out.println("5: Exit");
			
			System.out.println("Please Choose from 1 to 4 :");
			choice = Integer.parseInt(br.readLine());
			
			switch(choice)
			{
			case 1:
			 element = ll.get(2);
				System.out.println("List Element at position 2: "+element);
				break;
				
			case 2:
				element =ll.getLast();
				System.out.println(element);
				break;
			case 3:
				ll.set(5, "Color Pen");
				System.out.println(ll);
				break;
			case 4:
				System.out.println("Size of LinkedList :"+ll.size());
				break;
				default:
					return;
			}
		}
		
	}

}
