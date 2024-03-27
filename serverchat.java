import java.io.*;
import java.net.*;
public class Serverside
 {
    public static void main(String[] args)
    {
            Boolean b=true;
            try
            {
                        ServerSocket s=new ServerSocket(40);
                        ServerSocket s1=s.accept();
                        DataInputStream in1=new DataInputStream(s1.getInputStream());
                        DataInputStream out1=new DataInputStream(s1.getoutputStream());
                        PrintStream pw=new PrintStream(out1);
               
                while(b)
                {
                
                        String str=in.readLine();
                        if(str1.equals("quit"))
                                    b=false;
                                    else
                                    {
                                                System.out.println(str1);
                                                DataOutputStream in=new DataOutputStream(System.in);
                                                String str=in.readLine();
                                                pw.println(str2);
                                               
                                   
                                    }
                }
            }
            catch(Exception e)
            {
                       
                        System.out.println(e);
            }
       
    }
 }

