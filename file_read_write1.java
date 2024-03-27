		
import java.io.*;

class file_read_write1
{
public static void main(String []args)throws IOException
{

File f1=new File("hai.txt");
File f2=new File("temp.txt");
File f3=new File("hello.txt");

FileReader fr1=new FileReader(f1);
FileWriter fr2=new FileWriter(f2);

int s;

while((s=fr1.read())!=-1)
{
fr2.write(s);
}
fr1.close();
fr2.close();

FileReader fr3=new FileReader(f3);
FileWriter fr4=new FileWriter(f1);

while((s=fr3.read())!=-1)
{
fr4.write(s);
}
fr3.close();
fr4.close();


FileReader fr5=new FileReader(f2);
FileWriter fr6=new FileWriter(f3);

while((s=fr5.read())!=-1)
{
fr6.write(s);
}
fr5.close();
fr6.close();
f2.delete();
}
}
