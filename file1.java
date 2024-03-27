		
import java.io.*;

class file1
{
public static void main(String []args)throws Exception
{

File f1=new File("C://java//io/file111.java");

System.out.println(f1.getName());
System.out.println(f1.getParent());
System.out.println(f1.getPath());
System.out.println(f1.canRead());
System.out.println(f1.canWrite());
System.out.println(f1.exists());
System.out.println(f1.isFile());
System.out.println(f1.isDirectory());
System.out.println(f1.isHidden());
System.out.println(f1.length());

//		CREATE A NEW FILE

//File f2=new File("D://java//io/hai123.txt");

//f2.createNewFile();

//System.out.println(f2.lastModified());
//f2.delete();
/*
//File f3=new File("D://java//io/hai2.txt");

//f3.createNewFile();

//File f4=new File("D://java//io/hello1.txt");
//Thread.sleep(5000);
//f3.renameTo(f4);
//Thread.sleep(5000);
//f4.deleteOnExit();
*/


}
}