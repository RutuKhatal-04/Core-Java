import java.io.*;
import java.net.*;
class setb2server
{
    public static void main(String a[])
    {
        try
        {
            Socket s=new Socket("localhost",1100);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            OutputStream out=s.getOutputStream();
                DataOutputStream dout=new DataOutputStream(out);
            InputStream in=s.getInputStream();

                DataInputStream din=new DataInputStream(in);
            while(true)
            {
                System.out.println("enter the String");
                String s1=br.readLine();
                                try{

                if(s1.equals("Bye"))
                {
                    dout.writeUTF(s1);
                    String msg=din.readUTF();
                    System.out.println("msg from Server is"+msg);
                }
                            
                             } catch(Exception e){}
                        }
                   }catch(Exception e)
                {

                    System.out.println("Error"+e);
                }
            
         }
}

