import java.lang.reflect.*;

class reflection
{

public reflection()
{

}
public reflection(int a,int b,String s)
{

}

public int a=10;
public static int b=20;

public static void main(String []rags)throws Exception
{

Class cc=Class.forName("reflection");

System.out.println("\n\n");

Method []m=cc.getMethods();
for(int i=0;i<m.length;i++)
System.out.println(m[i]);

System.out.println("\n\n");

Constructor []con=cc.getConstructors();
for(int i=0;i<con.length;i++)
System.out.println(con[i]);

System.out.println("\n\n");

Field []ff=cc.getFields();
for(int i=0;i<ff.length;i++)
System.out.println(ff[i]);


}

public void a()
{
}
public static void b()
{
}
public void c()
{
}

}