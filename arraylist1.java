import java.util.*;

class arraylist1 
{

public static void main(String []args)
{

ArrayList a1=new ArrayList();

a1.add("hi");
a1.add("hello");
a1.add("it");
a1.add("hi");
a1.add("12352");
a1.add("^%&");

System.out.println("\n\n"+a1);
System.out.println(a1.size());
System.out.println(a1.isEmpty());
System.out.println(a1.indexOf("it"));
System.out.println(a1.lastIndexOf("hi"));
System.out.println(a1.get(4)+"\n\n");
System.out.println(a1.contains("www"));

System.out.println("\n\n");

a1.add(2,"ct");
a1.add(4,"eee");


System.out.println(a1);
System.out.println(a1.size());

System.out.println("\n\n");

a1.set(2,"www");
a1.set(5,"http");

System.out.println(a1);
System.out.println(a1.size()+"\n\n");

System.out.println("\n");

a1.remove("it");
a1.remove(6);

System.out.println(a1);
System.out.println(a1.size()+"\n\n");


System.out.println("\n\n");



Object o=a1.clone();
System.out.println(o);
o=a1.get(5);
System.out.println(o);


Object oo[]=a1.toArray();

for(int i=0;i<oo.length;i++)
{
System.out.println(oo[i]);
}

System.out.println("\n\n\n\t\ta2");


ArrayList a2=new ArrayList();

a2.add("one");

for(int i=0;i<5;i++)
{
a2.add(i);
}

System.out.println("\n\n"+a2);
System.out.println(a2.size());

System.out.println("\n\n");

a2.add(a1);

System.out.println("\n\n"+a2);
System.out.println(a2.size()+"\n\n");



System.out.println("\n\n\n\t\ta3");

ArrayList a3=new ArrayList();

a3.addAll(a1);

System.out.println("\n\n"+a3);
System.out.println(a3.size());

a3.addAll(3,a1);

System.out.println("\n\n"+a3);
System.out.println(a3.size());




System.out.println("\n\n\n\t\ta4");

ArrayList<Integer> a4=new ArrayList<Integer>();

for(int i=0;i<8;i++)
{
a4.add(i);
}
a4.add(5);
//a4.add(34.454);

System.out.println("\n\n"+a4);
System.out.println(a4.size());

a4.clear();

System.out.println("clear");
System.out.println("\n"+a4);
System.out.println(a4.size());



}
}