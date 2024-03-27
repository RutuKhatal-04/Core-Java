import java.util.*;
import java.io.*;


class comparator1
{
public static void main(String []args)
{

ArrayList a1=new ArrayList();

a1.add("it");
a1.add("ct");
a1.add("eee");

System.out.println(a1);

Collections.sort(a1);
System.out.println(a1);


ArrayList<c1> a2=new ArrayList<c1>();

a2.add(new c1("s101","raj","it"));
a2.add(new c1("s103","ram","ct"));
a2.add(new c1("s104","kumar","eee"));
a2.add(new c1("s102","ajay","eee"));


System.out.println(a2);

Collections.sort(a2);
System.out.println(a2);



}
}

class c1  implements Comparable<c1>

{

String code,name,dept;

public String CompareTo(c1 c)
{
 return  c.getDept() ;
}


c1(String c,String n,String d)
{
code=c;
name=n;
dept=d;
}


public String getCode()
{
return code;
}

public String getName()
{
return name;
}

public String getDept()
{
return dept;
}


public String toString()
{
return code+"\t"+name+"\t"+dept;
}

}
