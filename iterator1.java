import java.util.*;

class iterator1
{

public static void main(String []args)
{

int s=0;

LinkedList a1=new LinkedList();

for(int i=0;i<=5;i++)
{
a1.add(i);
}

System.out.println(a1+"\n\n");


Iterator itr=a1.iterator();

while(itr.hasNext())
{
Object ele=itr.next();
System.out.println(ele+"\n");
}

System.out.println("\n\n");

ListIterator itr1=a1.listIterator();

while(itr1.hasNext())
{
Object ele1=itr1.next();
itr1.set(ele1+"hai");
System.out.println(ele1+"\n");
}


//itr=a1.iterator();

while(itr1.hasPrevious())
{
Object ele=itr1.previous();
System.out.println(ele+"\n");
}



}
}