package String_logical_Program;

public class TotalStringCharacterCount
{
	public static void main(String args[])
	{
		String s="Karhale patil";
		int count = 0;
		
		// total lentgth of string
		System.out.println("Total number of String length: "+s.length());
		
		//Total Number of character in String
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			 count++;
			
		}
		System.out.println("Total Number of character in String :"+count);
		
	}

}
