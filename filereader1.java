		
import java.io.*;

class filereader1
{
public static void main(String []args)throws Exception
{	

FileReader fr1=new FileReader("filereader1.java");

BufferedReader br1=new BufferedReader(fr1);

String s;

//FileWriter fw1=new FileWriter("D://java//io/ok.cs",false);

while((s=br1.readLine())!=null)
{
System.out.println(s);
//Thread.sleep(200);
}
}
}