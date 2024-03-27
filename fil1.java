//writing bytes to a file
import java.io. *;
class file1
{
         public static void main (String args[])
          {
                  // Declare and initalize a byte array 
                  byte cities [ ] = {'D', 'E', 'L', 'H', 'I', '\n', 'M', 'A', 'D',
                          'R', 'A', 'S', '\n', 'L', 'O', 'N', 'D', 'O', 'N', '\n' };
                  // Create an output file stream
                  FileOutputStream  Outfile =null;
                   try
                   {
                                 // Connect the outfile stream to "city.text"
                                 Outfile  = new FileOutputStream  ("out.txt");
                                 // Write data to the stream
                                  Outfile.write (cities);
                                  Outfile.close ( ); 
                    }  
                    catch (Exception  ioe)
                     {
                             System.out.println(ioe);
                             System.exit (-1);
                      }
           }	
}
