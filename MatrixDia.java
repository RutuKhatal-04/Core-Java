import java.util.*;
class MatrixDia
{
	public static void main(String ar[])
	{
		int a[][]=new int[3][3],b[][]=new int[3][3],c[]=new int[3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enteres matrix 1 elements are:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter matrix 2 elements :");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enteres matrix is:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
					System.out.print(" "+a[i][j]);
			}
			System.out.println();
                                      }
		System.out.println("Matrix 2:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(" "+b[i][j]);
			}
			System.out.println();
		}
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<1;j++)
			{
				c[i]=a[i][j]+b[i][j];
			}
			for(j=1;j<2;j++)
			{
				c[i]=a[i][j]+b[i][j];
			}
			for(j=2;j<3;j++)
			{
				c[i]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Addition of Diagonal elements of 2 matrix:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}
		
	}
}