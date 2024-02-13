package Basic;

import java.util.Scanner;

public class Employee {

	int id;
	String name;
	
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	public void myEmployee()
	{
		System.out.println(this.name+"\t"+this.id);
		
	}
	
	public static void main(String[] args) {
	
		Scanner sn = new Scanner(System.in);
		 Employee arr[] = new Employee[3];
		 
		 for(int i=0;i<3;i++)
		 {
			 System.out.println("Enter Id :");
			int id =sn.nextInt();
			 
			 System.out.println("Enter Name :");
		   String name =sn.next();
			arr[i] = new Employee(id,name);
		 }
		 sn.close();
		 for(Employee e:arr)
		 {
			 e.myEmployee();
		 }

	}

}
