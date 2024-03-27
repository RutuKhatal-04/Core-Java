		//   TEXT EDITOR
import java.io.*;

class command_input3
{
public static void main(String []args)throws IOException
{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String s1[]=new String[100];

System.out.println("enter lines , type 'STOP' to quit");

for(int i=0;i<s1.length;i++)
{
s1[i]=br.readLine();
if(s1[i].equals("stop"))
{
break;
}
}

System.out.println("\n\n\t\tthis is u r file\n\n");

for(int i=0;i<s1.length;i++)
{
System.out.println(s1[i]);
if(s1[i].equals("stop"))
{
break;
}


}


}
}