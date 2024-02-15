package ArraysClass;
import java.io.*;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[5];
		System.out.println("Enter elemnt in array");
				for(int i=0;i<5;i++)
				{
					
					arr[i]=Integer.parseInt(br.readLine());
				}
		System.out.println("Original Array :");
				display(arr);
				
				Arrays.sort(arr);
				System.out.println("Sorted  Array :");
				display(arr);
				
				int pos = Arrays.binarySearch(arr,12);
				System.out.println("Element found at "+(pos+1)+"positin");
				
		
	}

	static void display(int[] arr) {
		for(int i:arr)
		{
			System.out.println(i);
		}
  }	
}