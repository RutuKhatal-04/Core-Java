//url connection example
import java.io.*;
import java.util.*;
import java.net.*;
class net3
{
	public static void main(String args[]) throws Exception
	{
		int c;
		URL hp =new URL("http://www.msbte.com/mainsite/");
		URLConnection hpcon=hp.openConnection();
		System.out.println("Date : "+new Date(hpcon.getDate()));
		System.out.println("type of content : "+hpcon.getContentType());
		System.out.println("Expires : "+hpcon.getExpiration());
		System.out.println("Date of last modification : "+new Date(hpcon.getLastModified()));
		int len=hpcon.getContentLength();
		System.out.println("Length of content : "+len);
		if(len>0)
		{
			System.out.println("Content");
			InputStream input=hpcon.getInputStream();
			int i=len;
			while(((c=input.read())!=-1) && (i>0))
			{
				System.out.println((char)c);
			}
			input.close();
		}
		else
		{
			System.out.println("No content available");
		}
	}
}