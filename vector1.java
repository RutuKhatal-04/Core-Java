import java.util.*;

class vector1
{

public static void main(String []args)
{

Vector v1=new Vector();

v1.addElement(5);
v1.addElement(6);
v1.addElement(3);

System.out.println(v1);
System.out.println(v1.size());
System.out.println(v1.capacity());

v1.addElement(6);
v1.addElement(7);

System.out.println(v1);
System.out.println(v1.size());
System.out.println(v1.capacity());

v1.addElement(5);
v1.addElement(6);
v1.addElement(3);
v1.addElement(5);
v1.addElement(6);
System.out.println(v1);
System.out.println(v1.size());
System.out.println(v1.capacity());
v1.addElement(3);
System.out.println(v1);
System.out.println(v1.size());
System.out.println(v1.capacity());

System.out.println(v1.isEmpty());
System.out.println(v1.contains("hi"));
System.out.println(v1.indexOf("hi"));
System.out.println(v1.indexOf("hi",2));
System.out.println(v1.lastIndexOf("hi"));
System.out.println(v1.lastIndexOf("hi",2));

System.out.println(v1.elementAt(2));
System.out.println(v1.firstElement());
System.out.println(v1.lastElement());

v1.setElementAt(2,1);
System.out.println(v1);

System.out.println("sub list = "+v1.subList(1,4));

v1.removeElementAt(0);
System.out.println(v1);

v1.insertElementAt(8,2);
System.out.println(v1);

v1.removeElementAt(9);
System.out.println(v1);

v1.clear();
System.out.println(v1);

}
}