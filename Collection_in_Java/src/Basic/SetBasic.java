package Basic;
import java.util.*;


public class SetBasic {

	public static void main(String[] args) {
       
		Set<String> fruitSet = new HashSet<>();           //declare Set
		
		fruitSet.add("Mango");
		fruitSet.add("Apple");
		fruitSet.add("Banana");
		fruitSet.add("Gauvava");
		fruitSet.add("Lichi");
		
		System.out.println(fruitSet);        //before Remove
		
		fruitSet.remove("Lichi");
		System.out.println(fruitSet);       //after removing
		
		System.out.println(fruitSet.contains("Banana"));
		System.out.println(fruitSet.size());

	}

}
