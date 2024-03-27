		//   READING LINES
import java.io.*;

class command_input2
{
public static void main(String []args)throws IOException
{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String s1;

System.out.println("enter lines , 'exit' to quit");

//	READ LINES

do
{
s1=br.readLine();
System.out.println(s1);
}while(!s1.equals("exit"));

}
}