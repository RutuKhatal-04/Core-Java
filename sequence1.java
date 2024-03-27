		
import java.io.*;

class sequence1
{
public static void main(String []args)throws IOException
{

FileInputStream fi1;
FileInputStream fi2;

fi1=new FileInputStream("h1.txt");
fi2=new FileInputStream("h2.txt");

SequenceInputStream fi3=new SequenceInputStream(fi1,fi2);

BufferedInputStream in1=new BufferedInputStream(fi3);
BufferedOutputStream out1=new BufferedOutputStream(System.out);
BufferedOutputStream out2=new BufferedOutputStream(new FileOutputStream("h3.txt",true));

int ch1;

while((ch1=in1.read())!=-1)
{
out1.write(ch1);
out2.write(ch1);
}

in1.close();
out1.close();
out2.close();
fi1.close();
fi2.close();

}
}
