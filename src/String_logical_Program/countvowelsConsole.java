package String_logical_Program;

public class countvowelsConsole 
{
	public static void main(String args[])
	{
		String s="gopal Karhale kk";
		int cCount=0;
		int vCount=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vCount++;				
			}
			
			else if (s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				cCount++;
			}
			 		
		}
		System.out.println("count of vowels :"+vCount);
		System.out.println("Count of consonant"+cCount);
		
	}

	private static void elseif(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private static void ifelse(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
