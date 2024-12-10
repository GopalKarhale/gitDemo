package interview;

public class reverseString {

	public static void main(String[] args) 
	{
		 
		String s="Gopal";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)  //4 3
		{
			rev=rev+s.charAt(i); // Gopa
		}
		System.out.println(rev);//l

	}

}
