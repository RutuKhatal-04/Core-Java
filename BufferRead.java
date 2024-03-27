import java.io.*;
class BufferRead
{
	public static void main(String ar[]) throws Exception
	{
		int a;
		long b;
		float c;
		double d;
		char e;
		String f;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter integer value:");
		a=Integer.parseInt(br.readLine());
		System.out.println("Enter the long value:");
		b=Long.parseLong(br.readLine());
		System.out.println("Enter the float value:");
		c=Float.parseFloat(br.readLine());
		System.out.println("Enter the Double value:");
		d=Double.parseDouble(br.readLine());
		System.out.println("Enter the String value:");
		f=br.readLine();
		System.out.println("Enter the character value:");
		e=(char)br.read();
		System.out.println("Integer value:"+a);
		System.out.println("Long value:"+b);
		System.out.println("Float value:"+c);
		System.out.println("Double value:"+d);
		System.out.println("Charcter value:"+e);
		System.out.println("String value:"+f);
	}
}
