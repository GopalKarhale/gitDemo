package logicalProgram;

public class AmstrongNumber
{
	public static void main(String args[])
	{
		//Amstrong number series : 153=1*1*1+5*5*5+3*3*3
		
		int num=153;
	 	int amst;
		int sum=0;
		int temp=num;
	 
		while(num>0)
		{
		  amst=num%10;
		  sum=sum+amst*amst*amst;
		  num=num/10;
		  
		  
		}
		 System.out.println(sum);
		 
		 if(temp == sum)
		 {		
			 System.out.println("This is  amstrong number");
		 }
		 else
		 {
			 System.out.println("This is not amstrong number");
			 
		 }
		
	}

}
