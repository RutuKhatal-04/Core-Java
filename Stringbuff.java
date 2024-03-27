//methods of StringBuffer class
class Stringbuff
{
	public static void main(String args[])
	{
		StringBuffer s = new StringBuffer("Hi Ram");
		
		System.out.println("s = "+s);
		System.out.println("Length = "+s.length());
		System.out.println("capacity = "+s.capacity());
		s.setLength(4);
		System.out.println("s = "+s);
		System.out.println("Length = "+s.length());
		System.out.println("capacity = "+s.capacity());

		StringBuffer s1 = new StringBuffer("Hello");		

		System.out.println("\ns1 =  "+s1);
		s1.setCharAt(1,'k');
		System.out.println("s1 = "+s1);
		
		StringBuffer s2=s.append(s1).append("Good morning");
		System.out.println("s2 = "+s2);

		s2.insert(21," shyam");

		System.out.println("s2 = "+s2);		

		System.out.println("reverse of s1 = "+s1.reverse());
		
		StringBuffer s3 = s2.delete(0,6);
		System.out.println("s3 = "+s3);

		StringBuffer s4 = s2.deleteCharAt(9);
		System.out.println("s4 = "+s4);
	} 
}