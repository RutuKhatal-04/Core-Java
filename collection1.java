import java.util.*;

class collection1 
{

public static void main(String []args)
{

ArrayList a1=new ArrayList();

a1.add("hi");
a1.add("hello");
a1.add("it");
a1.add("12352");
a1.add("*(");
a1.add("it");


System.out.println(a1+"\n");

Collections.sort(a1);
System.out.println("sort\t"+a1+"\n");


Collections.reverse(a1);
System.out.println("reverse\t"+a1+"\n");

System.out.println("min\t"+Collections.min(a1)+"\n");
System.out.println("max\t"+Collections.max(a1)+"\n");

//System.out.println(a1+"\n");

Collections.replaceAll(a1,"it","ct");
System.out.println("replaceAll\t"+a1+"\n");

a1.add("it");

Collections.swap(a1,2,4);
System.out.println("swap\t"+a1+"\n");


Collections.shuffle(a1);
System.out.println("shuffle\t"+a1+"\n");

Collections.fill(a1,"hi");
System.out.println("fill\t"+a1+"\n");


}
}