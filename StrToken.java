import java.util.StringTokenizer;
class StrToken
{
	public static void main(String[] args)
	{
		
		StringTokenizer str = new StringTokenizer("Welcome to Java Programming");
        StringTokenizer temp = new StringTokenizer("");
		int count = str.countTokens();
		System.out.println(count);
	    System.out.println("Welcome to Java Programming: "+str.hasMoreTokens());
		System.out.println("(Empty String) : "+temp.hasMoreTokens());
        System.out.println("\nTraversing the String:");
         while(str.hasMoreTokens())
        {
			System.out.println(str.nextElement());
		}
		
	}
}
