package Loops;

public class LadderIfStatement
{
	public static void main(String args[])
	{
		int a=20;
		int b=25;
		int c=17;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A value is greater than B & C : "+a);
				
			}
			else
			{
				System.out.println("C is greater: "+c);
			}
		}
		else 
		{
			if(b>c)
			{
				System.out.println("b is greater than c & a:"+b);
			}
			else
			{
				System.out.println("c is greater : "+c);
			}
		}
		
	}

}
