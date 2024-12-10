package logicalProgram;

public class PolindromNumber 
{
	public static void main(String args[])
	{
		int num=121;
		int remd;
		int sum=0;
		int temp=num;
		
		while(num>0)
		{
			remd=num%10;
			sum=(sum*10)+remd;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("polindrom number");
		}
		else
		{
			System.out.println("Not polindrom number");
		}
			
		
	}

}
