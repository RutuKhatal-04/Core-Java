import java.io.*;
public class filePrg1
{
	public static void main(String args[])
	{
		for(i=0;i<args.length;i++)
		File path=new File(args[i]);
		String exists=path.exists() ? "Yes" : "No";
		String canRead=path.canRead() ? "Yes" : "No";
		String canWrite=path.canWrite() ? "Yes" : "No";
		String isFile=path.isFile() ? "Yes" : "No";
		String isDirectory=path.isDirectory() ? "Yes" : "No";
		String isAbsolute=path.isAbsolute() ? "Yes" : "No";
		if(path.exists())
		{
                  		f1.size();
		}
	FilenameFilter only=new onlyext("html");
	String s[]=f1.list(only);
File f2;
for(int i=0;i<s.length;i++)
{
f2=new File(s[i]);
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
	}

