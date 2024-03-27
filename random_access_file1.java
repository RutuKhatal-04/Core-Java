		
import java.io.*;

class random_access_file1
{
public static void main(String []args)throws IOException
{
try
{
RandomAccessFile r1=new RandomAccessFile("ra1.txt","rw");
r1.writeInt(101);
r1.writeChar('A');
r1.writeDouble(102.647);
r1.writeInt(102);
r1.seek(0);
System.out.println(r1.readInt());
System.out.println(r1.readChar());
System.out.println(r1.readDouble());
System.out.println(r1.readInt());
r1.seek(1);
System.out.println(r1.readDouble());
System.out.println(r1.readInt());
r1.close();
}
catch(Exception ee)
{}
}
}
