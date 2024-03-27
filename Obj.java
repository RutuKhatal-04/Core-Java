class Time
{
	int hr,min,sec;
	Time()
	{
	}
	Time(int h,int m,int s)
	{
		hr=h;
		min=m;
		sec=s;
	}
	Time add(Time t)
	{
		Time temp=new Time();
		temp.hr=hr+t.hr;
		temp.min=min+t.min;
		temp.sec=sec+t.sec;
	 	if(temp.sec>60)
		{
			temp.sec = temp.sec - 60;
			temp.min = temp.min + 1;
			if(temp.min>60)
			{
				temp.min  = temp.min - 60;
				temp.min= temp.min;
				temp.hr  = temp.hr + 1;
			}
		}
	return(temp); 
	}
	
	void show()
	{
		System.out.println(hr+":"+min+":"+sec);
	}
}
class Obj
{

	public static void main(String ar[])
	{
		Time t1=new Time(5,25,46);
		System.out.println("1st time:");
		t1.show();
		Time t2=new Time(6,40,29);
		System.out.println("2nd time:");
		t2.show();
		Time t3=t1.add(t2);
		System.out.println("Sum of both time is:");
		t3.show();
	}

}