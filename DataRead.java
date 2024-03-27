import java.io.*;

class DataRead
{
	public static void main(String ar[]) throws Exception
	{
		int a;
		long b;
		float c;
		double d;
		char e;
		String f;

		DataInputStream din=new DataInputStream(System.in);
	
		System.out.println("Enter integer value: ");
		a=Integer.parseInt(din.readLine());

		System.out.println("Enter long value: ");
		b=Long.parseLong(din.readLine());
	
		System.out.println("Enter float value: ");
		c=Float.parseFloat(din.readLine());

		System.out.println("Enter double value: ");
		d=Double.parseDouble(din.readLine());
	
		System.out.println("Enter string value: ");
		f=din.readLine();
				
		System.out.println("Enter character value: ");
		e=(char)din.read();

		System.out.println("Integer value= "+a);
		System.out.println("Long value= "+b);
		System.out.println("Float value= "+c);
		System.out.println("Double value= "+d);
		System.out.println("Character value= "+e);
		System.out.println("String value= "+f);

	}
}