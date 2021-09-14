import java.util.Scanner;

class Matrices{
	int row,row2;
	int col,col2;
	int a[][];
	int b[][];
	Scanner s=new Scanner(System.in);
	
	void SetValue()
	{
		
		
		System.out.println("MATRIX-1");
		System.out.println("Enter the row:");
		row=s.nextInt();
		System.out.println("Enter the column:");
		col=s.nextInt();
		
		a=new int[row][col];
		
		System.out.println("Enter elements:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Elements are:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("MATRIX-2");
		System.out.println("Enter the row:");
		row2=s.nextInt();
		System.out.println("Enter the column:");
		col2=s.nextInt();
		
		b=new int[row2][col2];
		
		System.out.println("Enter elements:");
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<col2;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Elements are:");
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<col2;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}
		
		
	}
	
	void Addition()
	{
		if(row==row2 && col==col2)
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					a[i][j]=a[i][j]+b[i][j];
				}
				
			}
			
			System.out.println("Sum is:");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println("");
			}
			
		}
		else
		{
			System.out.println("You can't add these two matrices:");
		}
	}
	
}

public class Matrixx {
	public static void main(String[] args) {
		
		Matrices m1=new Matrices();
		Matrices m2=new Matrices();
		
		m1.SetValue();
		m1.Addition();
	}

}