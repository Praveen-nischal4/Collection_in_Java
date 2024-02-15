package Miscellaneous;
import java.util.*;
import java.io.*;

class Employee
{
	int id;
	String name;
	String add;
	
	Employee(int i,String nm,String ad)
	{
		this.id=i;
		this.name=nm;
		this.add=ad;
	}
	
	public void Dispaly()
	{
		System.out.println("ID :"+this.id);
		System.out.println("Name :"+this.name);
		System.out.println("Address :"+this.add);
	}
}
public class EmpList {

	public static void main(String[] args) throws NumberFormatException, IOException {

 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 int id;
 String name,address;
 
  ArrayList<Employee> arl = new ArrayList<>();
        for(int i=0;i<5;i++)
          {
	        System.out.println("Enter  id :");
	        id = Integer.parseInt(br.readLine());
	  
	         System.out.println("Enter Name :");
	         name =br.readLine();
	  
	         System.out.println(" Enter Address :");
	         address =br.readLine();
	      
	         Employee obj = new Employee(id,name,address);
	          arl.add(obj);
       }
        
        System.out.println("Search for Id :");
        id =Integer.parseInt(br.readLine());
        
        boolean found =false;
        
        for(int i =0;i<arl.size();i++)
        {
        	Employee obj =arl.get(i);     //get() return the ith object of Employee type
        	
        	if(id==obj.id)
        	{
        		obj.Dispaly();
        		found=true;
        	}
        	
        }
        
        if(!found)
        {
        	System.out.println("Employee Not Found");
        }
        
        
        
	}

}
