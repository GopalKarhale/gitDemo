package logicalProgram;

public class ReverseNumber1 
{
	public static void main(String args[])
	{
		
		int num=987654;
		int remd,rev=0;
		
		while(num!=0)
		{
			remd=num%10; 
			rev=rev*10+remd;
			num=num/10;		
		}
		System.out.print(rev);
		
	}

}


