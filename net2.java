//url example
import java.net.*;
class net2
{
	public static void main(String args[]) throws MalformedURLException
	{
		URL hp=new URL("http://www.msbte.com/mainsite/");
		System.out.println("Protocol : "+hp.getProtocol());
		System.out.println("Port :"+hp.getPort());
		System.out.println("Host : "+hp.getHost());
		System.out.println("File : "+hp.getFile());
		System.out.println("External Form : "+hp.toExternalForm());
	}
}	