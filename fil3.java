import java.io.*;
class fil3
{
         public static void main (String args[])
         {
                // Declare input and output file streams
                 FileInputStream infile=null;        //Input stream
                 FileOutputStream outfile=null;        //Output stream
                // Declare a variable to hold a byte
                byte byteRead;
                try
                {
                      // Connect infile to in.dat
                      infile =new FileInputStream ("out.txt");
                     // Connect outfile to out.dat
                      outfile =new FileOutputStream ("sample.txt");
                     // Reading bytes from in.dat and
                     // writing to out.dat
                     do 
                      {
                            byteRead =(byte) infile.read ( );
                            outfile.write (byteRead);
                       }                   while (byteRead != -1);
                 }
                 catch (FileNotFoundException e)
                  {
                        System.out.println ("File not found");
                   }
                   catch(IOException e)
                   {
                           System.out.println (e.getMessage( ));
                    } 
                    finally    //close files
                    {
                                 try
                                {
                                        infile.close ( );
                                        outfile.close( );
                                 }
                                 catch (IOException e)
                                 {
                                 }
                     }
          }
}
