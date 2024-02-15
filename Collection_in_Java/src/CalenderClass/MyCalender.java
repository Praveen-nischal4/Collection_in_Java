package CalenderClass;
import java.util.*;

public class MyCalender {

	public static void main(String[] args) {

     Calendar c1 = Calendar.getInstance();
     System.out.println(c1);
   
     int d =c1.get(Calendar.DATE);
     System.out.println(d);
     int m = c1.get(Calendar.MONTH);
     System.out.println(m+1);             //since Jan is taken as zero
     
     int y = c1.get(Calendar.YEAR);
     System.out.println(y);
     
     System.out.println("Full Date :");
     System.out.println(d+"-"+(m+1)+"-"+y);
     
     
     System.out.println(c1.get(Calendar.HOUR)+":"+c1.get(Calendar.MINUTE)+":"+c1.get(Calendar.SECOND));
	}

}
