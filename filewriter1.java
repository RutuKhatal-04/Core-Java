		
import java.io.*;

class filewriter1
{
public static void main(String []args)throws IOException
{

FileWriter fw1=new FileWriter("C://prajakta1//file111.txt",true);

fw1.write(" hi");
fw1.write("hello");

fw1.close();

}
}                                                                                                                                                                                                                                                                 