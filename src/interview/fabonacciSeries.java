package interview;

public class fabonacciSeries {

	public static void main(String[] args)
	{
		 //0,1,1,2,3,5 
		
		int n1=0;
		int n2=1;
		int n3;
		System.out.print(n1+" ,"+n2); //0,1
		
		for(int i=0;i<5;i++)
		{
		    
			n3=n1+n2;  
			System.out.print(","+n3);//1,2,3,5,8
		
			n1 = n2;
			n2 = n3;
			
		}

	}

}
