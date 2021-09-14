import java.util.Scanner;
public class Check
{
    public static void main(String[] args) 
    {
    	Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int x = s.nextInt();
	        if(x > 0)
	        {
	            System.out.println( "positive number");
	        }
	        else 
	        {
	            System.out.println(" negative number");
	        }
	       
	    }
	}
    