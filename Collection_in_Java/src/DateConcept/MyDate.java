package DateConcept;
import java.text.DateFormat;
import java.util.*;

public class MyDate {

	public static void main(String[] args) {
	 
		Date d = new Date();
		//System.out.println(d);
		
		DateFormat fmt =DateFormat.getDateInstance(DateFormat.SHORT,Locale.UK);
		String str =fmt.format(d);
		System.out.println(str);

	}

}
