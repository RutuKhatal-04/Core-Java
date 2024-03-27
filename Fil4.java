/* Using a single file for storing & retrieving*/

import java.io.*;

class Fil4
{
        public static void main(String args[])
        {
        DataInputStream dis=null;
        DataOutputStream dos=null;

        File intFile=new File("rand.dat");
        try
        {
                dos=new DataOutputStream(new FileOutputStream(intFile));
                        for(int i=0;i<20;i++)
                                dos.writeInt((int)(Math.random()*100));
        }
        catch(IOException ioe)
        {
                System.out.println(ioe.getMessage());
        }
        finally
        {
                try
                {
                        dos.close();
                }
                catch(IOException ioe)
                {
                }
        }
        try
        {
                dis=new DataInputStream(new FileInputStream(intFile));
                for(int i=0;i<20;i++)
                {
                        int n=dis.readInt();
                        System.out.print(n+" ");
                }
        }
        catch(IOException ioe)
        {
                System.out.println(ioe.getMessage());
        }
        finally
        {
                try
                {
                        dos.close();
                }
                catch(IOException ioe)
                {
                }
        }
        }

}
