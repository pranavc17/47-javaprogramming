import java.util.Scanner;

class Array{
	int arr[];
	
	Array(int size)
	{
		arr=new int[size];
	}
	
	void SetValue()
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
	}
	
	void Search(int sr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==sr)
			{
				System.out.println("Element "+arr[i]+" found at the position "+(i+1));
				System.exit(0);
			}
		}
		System.out.println("Element Not Found!!!");		
	}
	
	
}

public class Prgrm2 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the array size:");
		int size=s.nextInt();
		
		Array ar=new Array(size);
		ar.SetValue();
		
		System.out.println("Enter the search element:");
		int sr=s.nextInt();		
		ar.Search(sr);	
		
	}

}
