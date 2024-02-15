package StringTokenClass;
import java.util.*;
import java.io.*;

public class StringDemo {

	public static void main(String[] args) throws IOException {
		
		//String str ="Hello Welcome to the World of Java";
		
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str =br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		System.out.println("No of Tokens in StringTokenizer Object si : "+st.countTokens());
		 
		while(st.hasMoreTokens())
		{
			String one = st.nextToken();
			System.out.println(one);
		}

	}

}
