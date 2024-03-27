		
import java.io.*;

class bufferedreader1
{
public static void main(String []args)throws IOException
{


String s="this is a copy";

char buf[]=new char[s.length()];

s.getChars(0,s.length(),buf,0);

CharArrayReader in=new CharArrayReader(buf);
BufferedReader f=new BufferedReader(in);

int c;

while((c=f.read())!=-1)
{
System.out.println((char)c);
}

StringReader ss=new StringReader("hello hai welcome how u");
BufferedReader f1=new BufferedReader(ss);

int c1;

while((c1=f1.read())!=-1)
{
if(c1=='e')
{
f1.skip(3);
}


System.out.println((char)c1);

}

}
}