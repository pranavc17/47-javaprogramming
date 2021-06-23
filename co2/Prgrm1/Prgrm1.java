
import java.util.Scanner;

class Sort {
    String word;
    
    void sort(String w)
    {
    	word=w;
    	char temp;
    	
    	int length=word.length();
    	char arr[]=word.toCharArray();
    	for(int i=0;i<length-1;i++)
    	{
    		for(int j=i+1;j<length;j++)
    		{
    			if(arr[i]>arr[j])
    			{
    				temp=arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    			}
    		}
    	}
    	System.out.println(new String(arr));
    }
}

public class Prgrm1 {
    public static void main(String[] args) 
    {
    	
        Scanner sc = new Scanner(System.in);
        Sort s= new Sort();

        System.out.println("Enter a String : ");
        String word = sc.nextLine();
        s.sort(word);
    }

}