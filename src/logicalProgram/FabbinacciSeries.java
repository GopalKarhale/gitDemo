package logicalProgram;

public class FabbinacciSeries 
{
	public static void main(String args[])
	{
		//fabbinacci series : 0,1,1,2,3,5,8,13,21....
		
		int a=0;
		int b=1;
		 
		int sum=0;
		
		System.out.print(a+","+b);
		
		for(int i=2;i<=10;i++)
		{
		   sum=a+b;
			System.out.print(","+ sum);
 
		   a=b;
		   b=sum;
		   
		}
	}
	
}
