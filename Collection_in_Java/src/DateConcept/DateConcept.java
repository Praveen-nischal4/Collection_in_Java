package DateConcept;
import java.util.*;
import java.text.*;

public class DateConcept {

	public static void main(String[] args) {

		Date d = new Date();
		// formate Date to Medium  and time to Short
		DateFormat fmt = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.SHORT , Locale.UK);
        String str = fmt.format(d);
        System.out.println(str);
		
	}

}
