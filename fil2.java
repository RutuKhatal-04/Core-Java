//Reading bytes from a file
import java.io.*;
class fil2
{
       public static void main (String args[])
       {
                               // Create an input file stream
                 FileInputStream infile=null;
                 int b;
                 try
                 {
                              //Connect infile stream to the required file
                  infile=new FileInputStream("sample.txt");
                              //Read and display data
                  while((b=infile.read())!=-1)
                      {
                             System.out.print((char)b);
                      }
                       infile.close();
                 }
                 catch(IOException ioe)
                 {
                        System.out.println(ioe);
                 }
        }
}
