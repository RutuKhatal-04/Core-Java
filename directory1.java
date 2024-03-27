		
import java.io.*;

class directory1
{
public static void main(String []args)throws Exception
{

//		CREATE A DIRECTORY


File f1=new File("C://java//io//www//java");
f1.mkdir();


for(int i=0;i<5;i++)
{
File f2=new File("C://java//io//www//java "+i);
//Thread.sleep(2000);
f2.mkdir();
}


}
}