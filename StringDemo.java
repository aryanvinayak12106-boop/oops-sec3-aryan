public class StringDemo
	{
	public static void main(String[] args)
	{
	   String str ="This is some sample String with some words that have been repeated some times";

	System.out.println("Total no. of characters : " + str.length()); 
	System.out.println("To Upper Case : " + str.toUpperCase()); 
	System.out.println("To Lower Case : " + str.toLowerCase()); 
	System.out.println("Original String : " + str);
	System.out.println(str.substring(8)); 
	System.out.println(str.substring(8,19));
	System.out.println(str.indexOf("some"));
	
    }
}
