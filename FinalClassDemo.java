final class A
{
	void display()
	{
		System.out.println("A's Display");
	}
}

class B extends A
{
	void display()  
	{
		System.out.println("B's Display");
	}
}

class FinalClassDemo
{
	public static void main(String args[])
	{
		B b = new B();

		b.display();
	}
}