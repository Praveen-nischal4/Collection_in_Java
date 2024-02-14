package StackConcept;
import java.io.*;

import java.util.*;

public class MyStack {

	public static void main(String[] args) throws NumberFormatException, IOException {
 
		int ch=0;
		int element,pos;
		
		Stack<Integer> st = new Stack<Integer>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(ch<4)
		{
			System.out.println(" Operations On Stack");
			System.out.println("0 : Check Stack is Empty");
			System.out.println("1 : Push OPeration in Stack");
			System.out.println("2 : Pop Operation in Stack");
			System.out.println("3 : Search Operation in Stack");
			System.out.println("4 : Exit");
			
			ch =Integer.parseInt(br.readLine());
			
			switch(ch)
			{
			case 0:
				if(st.empty())
				{
					System.out.println("Stack is Empty");
				}else
				{
					System.out.println("Not Empty");
				}
				break;
				
			case 1: 
				System.out.println("Enter Element in Stack");
				element = Integer.parseInt(br.readLine());
				st.push(element);
				System.out.println("Element inserted successfully");
				break;
			
			
			case 2:
				Integer obj = st.pop();
				System.out.println("Element Poped :"+obj);
				break;
				
			case 3:
				System.out.println("Element to be searched");
				element = Integer.parseInt(br.readLine());
				pos = st.search(element);
				if(pos == -1)
					System.out.println("Element Not Found ");
				else
					System.out.println("Element Found :"+pos);
				break;
			default :
				return;
		  }
		
			System.out.println("Stack Content :"+st);
			
			for(Integer s:st)
			{
				System.out.println(s);
			}

	  }

   }
}
