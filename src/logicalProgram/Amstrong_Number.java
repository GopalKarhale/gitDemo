package logicalProgram;

public class Amstrong_Number
{
	public static void main(String args[])
	{
		//amstrong number : square of each number equal to same number
		int num=371;
		int sum=0,remd;
		int temp=num;
		
		while(num!=0)
		{
			remd=num%10;
			sum=sum+remd*remd*remd;
			
			num=num/10;
			
		}
		if(sum==temp)
		{
			System.out.println("This is amstrong number");
		}
		else
		{
			System.out.println("This is not amstrong number");
		}
		
		
		
	}

}
