package ArrayList;
import java.io.*;
import java.util.*;

class Ascend implements Comparator<Integer>
{

	@Override
	public int compare(Integer i1, Integer i2) {
		return i1.compareTo(i2);
	}
	
}
class Descend implements Comparator<Integer>
{

	@Override
	public int compare(Integer i1, Integer i2) {
		return i2.compareTo(i1);
	}
	
}
public class MyArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("How many Elements ");
		int size =Integer.parseInt(br.readLine());
		
		Integer[] arr = new Integer[size];
		
		//enter value inside array
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter int :");
			arr[i] =Integer.parseInt(br.readLine());
		}
	  
		Arrays.sort(arr,new Ascend());
		
		System.out.println("Array in Ascending Order");
		dispaly(arr);
		
		Arrays.sort(arr,new Descend());
		
		System.out.println("Array in Ascending Order");
		dispaly(arr);
	}

	 static void dispaly(Integer[] arr)
	 {
           for(int i:arr)
             {
	      System.out.print(i+"\t");
        }
	}

}
