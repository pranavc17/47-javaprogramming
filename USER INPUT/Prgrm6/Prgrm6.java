import java.util.Scanner;

public class Prgrm6 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of array:");
		int a=s.nextInt();
		int[] arr=new int[a];
		
		System.out.println("Enter array Elements:");
		for(int i=0;i<a;i++)
		{
			arr[i]=s.nextInt();
		}
		
		int temp=arr[0];
		for(int i=1;i<a;i++)
		{
			if(temp>arr[i])
			{
				temp=arr[i];
			}
		}
		
		System.out.println("Smallest element is:"+temp);
	}

}
