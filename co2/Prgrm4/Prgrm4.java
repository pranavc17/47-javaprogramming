import java.util.Scanner;

class Employee{
	int eNo;
	String eName;
	long eSalary;
	
	void GetData()
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Employee Number:");
		eNo=Integer.parseInt(s.nextLine());
		
		System.out.println("Enter Employee Name:");
		eName=s.nextLine();
		
		System.out.println("Enter Employee Salary:");
		eSalary=Integer.parseInt(s.nextLine());
		
	}
	
	void Display()
	{
		System.out.println("eNo :"+eNo+"  eName :"+eName+"  eSalary :"+eSalary);
	}
	
	void Search(Employee emp[],int n,int en)
	{
		
		int c=0;
		
		for(int i=0;i<n;i++)
		{
			if(emp[i].eNo==en)
			{
				c++;
				System.out.println("Employee Name: "+emp[i].eName);
				break;
			}
			
		}	
			if(c==0)
			{
				System.out.println("Employee Not Found!!!");
			}
	}
	
}

public class Prgrm4 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number of Employees:");
		int n=s.nextInt();
		
		Employee emp[]=new Employee[n];
		
		for(int i=0;i<n;i++)
		{
			emp[i]=new Employee();
		}
		
		for(int i=0;i<n;i++)
		{
			emp[i].GetData();
		}
		
		for(int i=0;i<n;i++)
		{
			emp[i].Display();
		}
		
		System.out.println("Enter the employee number to search:");
		int en=s.nextInt();
		
		emp[1].Search(emp,n,en);
		
		
	}

}
