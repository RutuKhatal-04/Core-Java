		//   READING CHARACTERS
import java.io.*;

class command_input1
{
public static void main(String []args)throws IOException
{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

char c;

System.out.println("enter chars , 'q' to quit");

//	READ CHARACTERS

do
{
c=(char)br.read();
System.out.print(c);
}while(c!='q');



}
}