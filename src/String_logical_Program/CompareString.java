package String_logical_Program;

public class CompareString 
{
	public static void main(String[] args) 
	{
     String s1=new String("gopal");
     String s2=new String("gopal");
     
     //comapare the reference object 
     System.out.println(s1==s2); //false
     // compare the content of object
     System.out.println(s1.equals(s2)); // true
		
	}

}
