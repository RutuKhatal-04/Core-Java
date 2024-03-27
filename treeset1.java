import java.util.*;

class treeset1
{
public static void main(String []args)
{

TreeSet t1=new TreeSet();

t1.add("www");
t1.add("http");
t1.add("ww");
t1.add("htp");
t1.add("www");
t1.add("http");

System.out.println(t1);
System.out.println(t1.first());
System.out.println(t1.last());
System.out.println(t1.clone());
System.out.println(t1.headSet("ww"));
System.out.println(t1.tailSet("htp"));
System.out.println(t1.subSet("htp","www"));


}
}