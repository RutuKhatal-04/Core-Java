import java.util.*;

class linkedlist1
{
public static void main(String []args)
{

LinkedList l1=new LinkedList();

l1.add("hai");
l1.add("hello");
l1.add("it");
l1.addFirst("ct");
l1.add("eee");
l1.addLast("civil");
l1.add("it");

System.out.println(l1);

System.out.println(l1.getFirst());
System.out.println(l1.getLast());

l1.removeFirst();
l1.removeLast();

System.out.println(l1.getFirst());
System.out.println(l1.getLast());


}
}