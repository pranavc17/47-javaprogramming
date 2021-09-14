import java.util.Scanner;


class Matrix
{
	

	int row;

	int col;

	int arr[][];

	
Matrix(int row,int col)

	{

		this.row=row;

		this.col=col;

		arr=new int[row][col];

	}

	
void SetValue()

	{

		Scanner s=new Scanner(System.in);

		
System.out.println("Enter elements:");

		for(int i=0;i<row;i++)

		{

			for(int j=0;j<col;j++)

			{

				arr[i][j]=s.nextInt();

			}

		}

		
System.out.println("Elements are:");

		for(int i=0;i<row;i++)

		{

			for(int j=0;j<col;j++)

			{

				System.out.print(arr[i][j]+" ");

			}

			System.out.println("");

		}

	}

	
void Symmetric()

	{

		if(row==col)

		{

			int c=0;

			for(int i=0;i<row;i++)

			{

				for(int j=0;j<col;j++)

				{

					if(arr[i][j]==arr[j][i])

					{

						c=0;


					}
					else

					{

						c++;

						break;
                                         }

				}

			}

			if(c==0)

			{

				System.out.println("Symmetric matrix");

			}
			else

			{

				System.out.println("Not a Symmetric Matrix!!!");

			}

		}

		else

		{

			System.out.println("Not a Symmetric Matrix!!!");

		}

	}

}




public class Matrixx1
{

	public static void main(String[] args)
 	{

		int m,n;

		Scanner s=new Scanner(System.in);

		
System.out.println("Enter the row");

		m=s.nextInt();

		System.out.println("Enter the column:");

		n=s.nextInt();

		
Matrix ma=new Matrix(m,n);

		
ma.SetValue();

		ma.Symmetric();
		
}


}