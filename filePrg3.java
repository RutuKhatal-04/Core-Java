import java.io.*;
import java.io.File;

public class filePrg3
{
	public static void main(String args[])
	{
                String dirname="/java";
                File f=new File(dirname);
                if(f.isDirectory())
                {
                        System.out.println("Directory of : "+dirname);
                        String s[]=f.list();
                        for(int i=0;i<s.length;i++)
                        {
                                File f1=new File(dirname+"/"+s[i]);
                                if(f1.isDirectory())
                                {
                                        System.out.println(s[i]+" is a Directory");
                                }
                                else
                                {
                                        System.out.println(s[i]+" is a File");
                                }
                        }
                }
                else
                {
                        System.out.println(dirname+" is not a Directory");
                }
	}
}
