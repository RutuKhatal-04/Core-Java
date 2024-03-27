import java.io.*;
import java.net.*;

public class Clientside
 {
    public static void main(String[] args)
    {
            Boolean b=true;
            try
            {
                        Socket s1=new Socket("localhost",40);
                        DataInputStream in1=new DataInputStream(s1.getInputStream());
                        DataInputStream out1=new DataInputStream(s1.getoutputStream());
                        PrintStream pw=new PrintStream(out1);
                System.out.println("Seand massage");
                while(b)
                {
                        DataInputStream in=new DataInputStream(System.in);
                        String str=in.readLine();
                        if(str1.equals("quit"))
                                    b=false;
                                    else
                                    {
                                                pw.println(str1);
                                                String str1=in.readLine();
                                                System.out.println(str2);
                                   
                                    }
                }
            }
            catch(Exception e)
            {
                       
                        System.out.println(e);
            }
       
    }
 }

