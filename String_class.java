class String_class
{
public static void main(String []args)
{

String s1="haCi hEllo haweLCome";
String s2="HaCi hEllo haweLCome";

System.out.println("\n\t\ts1 = "+s1+"\n");

System.out.println("\ns1.length() = "+s1.length());

System.out.println("\ns1.charAt(5) = "+s1.charAt(5));

System.out.println("\ns1.equals(s2) = "+s1.equals(s2));
System.out.println("\ns1.equalsIgnoreCase(s2) = "+s1.equalsIgnoreCase(s2));

System.out.println("\ns1.startsWith(\"hai\") = "+s1.startsWith("hai"));
System.out.println("\ns1.startsWith(\"h , 4\") = "+s1.startsWith("h",4));
System.out.println("\ns1.endsWith(\"hai\") = "+s1.endsWith("hai") );

System.out.println("\ns1.indexOf(\"ha\") = "+s1.indexOf("we"));
System.out.println("\ns1.indexOf(\"h , 3\") = "+s1.indexOf("h",3));

System.out.println("\ns1.lastIndexOf(\"me\") = "+s1.lastIndexOf("me"));

System.out.println("\ns1.substring(5) = "+s1.substring(5));
System.out.println("\ns1.substring(5,8) = "+s1.substring(5,8));

System.out.println("\ns1.concat(\"ok\") = "+s1.concat("ok"));

System.out.println("\ns1.replace(o , z) = "+s1.replace('o','z'));
System.out.println("\ns1.replaceFirst(\"ha , wa\") = "+s1.replaceFirst("ha","wa"));
System.out.println("\ns1.replaceAll(\"ha , kk\") = "+s1.replaceAll("ha","kk"));

System.out.println("\ns1.toLowerCase() = "+s1.toLowerCase());
System.out.println("\ns1.toUpperCase() = "+s1.toUpperCase());

String s3="       ok yes           no          ";
System.out.println("\ns3 = "+s3);
System.out.println("\ns3.trim() = "+s3.trim());


String s6="hai hello welcome ok";
char []cc=s6.toCharArray();
for(int ii=0;ii<cc.length;ii++)
{
System.out.println(cc[ii]);
}


String s7="hai hello welcome ok";
char []dd=new char[15];
s6.getChars(0,5,dd,3);
for(int ii=0;ii<dd.length;ii++)
{
System.out.println(dd[ii]);
}
                                            




}
}