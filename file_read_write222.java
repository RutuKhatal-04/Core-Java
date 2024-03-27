		
import java.io.*;

class file_read_write1
{
public static void main(String []args)throws IOException
{

File f1=new File("file_read_write1.java");
File f2=new File("file_read_write222.java");

FileReader fr1=new FileReader(f1);
FileWriter fr2=new FileWriter(f2);

int s;

while((s=fr1.read())!=-1)
{
//System.out.println(br1.ready());
fr2.write(s);
}
fr1.close();
fr2.close();
}
}