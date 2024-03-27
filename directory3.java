import java.io.*;

class directory3
{
public static void main(String []args)throws IOException
{

String dirname="D://java//io";
File f1=new File(dirname);
FilenameFilter only=new onlyext("java");
String s[]=f1.list(only);

for(int i=0;i<s.length;i++)
{
System.out.println(s[i]);
}

}
}


class onlyext implements FilenameFilter
{
String ext;
public onlyext(String ext)
{
this.ext="."+ext;
}
public boolean accept(File dir,String name)
{
return name.endsWith(ext);
}

}