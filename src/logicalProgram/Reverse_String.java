package logicalProgram;

public class Reverse_String
{
	public static void main(String args[])
	{
		String s="gopal karhale ";
		String rev=" ";
		
		int length=s.length();
		System.out.println(length);
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		 
		}
		System.out.println("Original streen :"+s);
		System.out.println("reverse String "+rev);
		
		
	}

}
