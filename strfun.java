//String Functions
class strfun
{
	public static void main(String args[])
	{
		String s = "Hello";
		String s1 = new String("Good");
		String s2 = "        morning        ";
	
		//display
		System.out.println("s  = "+s);
		System.out.println("s1 = "+s1);
		System.out.println("s2  = "+s2);		
		System.out.println("s.toLowerCase() : "+s.toLowerCase());		
		System.out.println("s.toUpperCase() : "+s.toUpperCase());
		System.out.println("s1.replace('o','a') : "+s1.replace('o','a'));
		System.out.println("s2.trim() : "+s2.trim());
		System.out.println("s.equals(s1) : "+s.equals(s1));
		System.out.println("s.length() : "+s.length());
		System.out.println("s.charAt(3) : "+s.charAt(3));
		System.out.println("s.concat(s1) : "+s.concat(s1));
		System.out.println("s.substring(2) : "+s.substring(2));
		System.out.println("s.substring(1,3) : "+s.substring(1,3));
		System.out.println("s1.indexOf('d') : "+s1.indexOf('d'));
		System.out.println("s.compareTo(s1) : "+s.compareTo(s1));
		System.out.println("startsWith : "+s.startsWith("He"));
		System.out.println("endsWith : "+s.endsWith("lo"));
	}
}