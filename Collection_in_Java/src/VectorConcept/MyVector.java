package VectorConcept;
import java.util.*;

public class MyVector {

	public static void main(String[] args) {

		Vector<String> vl = new Vector<>();
		vl.add("Lux");
		vl.add("Pears");
		vl.add("Santoor");
		vl.add("Nirma");
		
		System.out.println("Vector List :"+vl);
		
		vl.add(2,"Dove");
		System.out.println("Vector List after adding :"+vl);
		
		vl.remove("Nirma");
		System.out.println("Vector List after Removing :"+vl);
		
		System.out.println(vl.contains("Pears"));
		System.out.println(vl.get(3));
		System.out.println(vl.size());
		
	}

}