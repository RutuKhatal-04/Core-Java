class interface2 implements i1,i2
{

public void a()
{
System.out.println("a");
}

public void b()
{
System.out.println("b");
}

public void c()
{
System.out.println("c");
}

public static void main(String []args)
{

interface2 in1=new interface2();

in1.a();
in1.b();


}
}

interface i1
{
void a();
void b();
}

interface i2
{
void c();
}

