import java.lang.System;
import java.lang.Runtime;
import java.io.IOException;

public class Runtime_class
 {
 public static void main(String args[]) throws IOException 
{
  	Runtime r = Runtime.getRuntime();

	long freeMem = r.freeMemory() / 1024;
  	long totalMem = r.totalMemory() / 1024;
  	System.out.println("Free memory : " + freeMem + " KB");
  	System.out.println("Total memory : " + totalMem + " KB");



//	r.exec("C:\\Program Files\\WinRAR\\winRAR.exe");

	r.exec("C:\\Program Files\\Windows Media Player\\wmplayer.exe");
 }
} 

