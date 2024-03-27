//nested or inner classes

class outer
{
	int x=300;
	void show()
	{
		inner i1 = new inner();
		i1.display();
		
	}
	class inner
	{
		void display()
		{
			System.out.println("In display of inner class x= "+x);
		}
	}
}

class outin
{
	public static void main(String args[])
	{
		outer o1 = new outer();
		System.out.println("In main");
		o1.show();
	}
}