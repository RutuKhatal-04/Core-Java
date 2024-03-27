		
import java.io.*;
class directory2
{
public static void main(String []args)throws IOException
{

String s="D://rakhi";

File f1=new File(s);

if(f1.isDirectory())
{

File f2;

String li[]=f1.list();

System.out.println("\n\t\tdirectory of \t"+s+"\n\n");

for(int i=0;i<li.length;i++)
{
f2 =new File(s+"/"+li[i]);
if(f2.isDirectory())
{
System.out.println(li[i]);
}
}
System.out.println("\n\t\t file of \t"+s+"\n\n");
for(int i=0;i<li.length;i++)
{
f2 =new File(s+"/"+li[i]);
if(f2.isFile())
{
System.out.println(li[i]);
}
}
}
}
}