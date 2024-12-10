package logicalProgram;

public class largestNumber {

	public static void main(String[] args)
	{
		int a[]= {10,12,18,50,25};
		int temp = 0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i];j++)
			{
			if(a[i]>a[j])
			{
				
				a[i]=a[j];
				a[j]=temp;
				 
			}
			System.out.println(a[i]);
			}
		}
 
	}

}
