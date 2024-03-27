//String Constructor  of String Class
class strcons
{
	public static void main(String args[])
	{
		//String Constructor

		String s=new String(); //refers to String Object(String of length Zero)

		String s1 = new String("Good Morning");

		char c[]={'h','e','l','l','o'};
		String  s2 = new String(c);  //to pass character array as parameter

		String  s3 = new String(c,1,3);	//String(char array,start,end)	

		String  s4 = new String(s2);     //copy constructor

		//display
		System.out.println("s  = "+s);
		System.out.println("s1  = "+s1);
		System.out.println("s2  = "+s2);
		System.out.println("s3  = "+s3);		
		System.out.println("s4  = "+s4);		
	}
}