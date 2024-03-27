import java.util.*;
class Matrix3
{
	public static void main(String ar[])
	{
		int a[][]=new int[3][3],b[][]=new int[3][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enteres matrix 1 elements are:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt;
			}
		}
		System.out.println("Enteres matrix is:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
					System.out.print(" ",a[i][j]);
			}
			System.out.println();
                                      }
	}

}