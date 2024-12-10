package String_logical_Program;

public class Revese_String 
{
	public static void main(String args[])
	{
	String s="karhale GOpal";
	String rev=" ";
	
	for(int i=s.length()-1;i>=0;i--)
	{
		
		rev=rev+s.charAt(i);
	}
		System.out.println("Original string:"+s);
		System.out.println("========= reverse String:====="+rev);

}
}
