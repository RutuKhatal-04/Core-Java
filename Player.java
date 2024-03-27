import java.util.*;
class Player
{
	public static void main(String ar[])
	{
	String player[]=new String[5];
	String name[]=new String[50];
	String replace[]=new String[50];
	int i,j;
	char ch;
	Scanner sc =new Scanner(System.in);
	System.out.println("\n Enter the player name:");
	for(i=0;i<5;i++)
	{
		player[i]=sc.next();
	}
	for(i=0;i<5;i++)
	{
		name[i]=" ";
		for(j=2;j<player[i].length();j++)
		{
			ch=player[i].charAt(j);
			name[i]=name[i]+ch;
		
		}

		
	}
	for(i=0;i<5;i++)
	{
		System.out.println("Name :"+name[i]);
	}
	for(i=0;i<5;i++)
	{
		replace[i]="";
		for(j=0;j<player[i].length();j++)
		{
			if(player[i].startsWith("s"))
			{
				System.out.println("replace:"+player[i].replaceAll("e","a"));
				break;
				
				
			}
		}	
				
	}
	/*for(i=0;i<5;i++)
	{
		System.out.println("replace:"+replace[i]);
	}
	*/
	}
}