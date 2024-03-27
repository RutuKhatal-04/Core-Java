import java.util.*;

class treemap1
{

public static void main(String []args)
{

TreeMap t1=new TreeMap();
TreeMap t3=new TreeMap();

t1.put("b","it");
t1.put("A","it");
t1.put("a","eee");
t1.put("b","civil");

System.out.println(t1);

System.out.println(t1.size());
System.out.println(t1.firstKey());
System.out.println(t1.lastKey());
System.out.println(t1.containsKey("a"));
System.out.println(t1.containsValue("it"));
System.out.println(t1.get("a"));
t1.remove("b");

System.out.println(t1);

t3.putAll(t1);

System.out.println("\n\t\tt3"+t3);

t3.clear();

System.out.println("\n\t\tt3"+t3);

TreeMap t2=new TreeMap();

t2.put("suresh",new Integer(100));
t2.put("babu",new Integer(200));
t2.put("kumar",new Integer(250));

System.out.println(t2);

Set s=t2.entrySet();

int sum=0;

Iterator i1=s.iterator();

while(i1.hasNext())
{

Map.Entry me=(Map.Entry)i1.next();
System.out.println(me.getKey()+"\t");
System.out.println(me.getValue()+"\t");
sum=sum+((Integer)me.getValue()).intValue();

}

System.out.println();
System.out.println(sum);

int b=((Integer)t2.get("kumar")).intValue();

t2.put("kumar",new Integer(b+50));

System.out.println("\n");

System.out.println(t2);

sum=0;

i1=s.iterator();

while(i1.hasNext())
{

Map.Entry me=(Map.Entry)i1.next();
System.out.println(me.getKey()+"\t");
System.out.println(me.getValue()+"\t");
sum=sum+((Integer)me.getValue()).intValue();

}

System.out.println();
System.out.println(sum);

}
}