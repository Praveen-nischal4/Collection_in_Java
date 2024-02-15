package CalenderClass;
import java.util.*;

public class MyCal {

	public static void main(String[] args) {

Calendar c2 = Calendar.getInstance();


     c2.set(Calendar.DATE, 20);
     c2.set(Calendar.MONTH, 1);
     c2.set(Calendar.YEAR, 2024);
System.out.println(c2.getTime());
	}

}
