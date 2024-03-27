		
import java.io.*;

class file_read_write_primitive1
{
public static void main(String []args)throws IOException
{

File f1=new File("w1.txt");
FileOutputStream fo1=new FileOutputStream(f1);
DataOutputStream do1=new DataOutputStream (fo1);

do1.writeInt(2434);
do1.writeBoolean(true);
do1.writeInt(1223);
do1.writeBoolean(false);
do1.close();
fo1.close();

FileInputStream fi1=new FileInputStream(f1);
DataInputStream di1=new DataInputStream (fi1);
for(int i=0;i<2;i++)
{
System.out.println(di1.readInt());
System.out.println(di1.readBoolean());
}
di1.close();
fi1.close();

}
}
