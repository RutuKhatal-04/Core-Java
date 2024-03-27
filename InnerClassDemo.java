class A
{
	int ano;
	
	void accept()
	{
		ano = 100;
	}

	void display()
	{
		System.out.println("A No is : "+ano);
	}

	class B
	{
		int bno;

		A a = new A();

		void setData()
		{
			a.accept();
			bno = 200;
		}

		void getData()
		{
			a.display();
			System.out.println("B No is : "+bno);
		}
	}
}

class InnerClassDemo
{
	public static void main(String args[])
	{
		A.B b = new A().new B();

		b.setData();
		b.getData();
	}
}