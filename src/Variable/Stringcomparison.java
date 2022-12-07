package Variable;


public class Stringcomparison {

	public static void main(String[] args) {
		String stringData="LiveTech";
		int characterAt =stringData.charAt(1);
		System.out.println(characterAt);
		System.out.println(stringData.charAt(2));
		int count =stringData.length();
		
		System.out.println("the length of the string is "+count);
		
	String  stringToLowercase=stringData.toLowerCase();
		System.out.println(stringToLowercase);
		String stringToUppercase=stringData.toUpperCase();
		System.out.println(stringToUppercase);
		String string1 ="livetech";
		String string2 ="selenium";
		String string3 ="Tech";
		String string4 ="selenium";
		
		
		if (string1.equals(string2))
		{
		System.out.println("both strings are equal");
		}
		else
		{
		System.out.println("both strings are equal");
		}	
		if (string3.contains(string1))
		{	
		System.out.println("stringe existing");
		}
		else	
		{	
		System.out.println("string not existing");	
		}
		if (string2.equalsIgnoreCase(string4))
		{
		System.out.println("both variable strings2andstring4are equal");
		}
		
		else
		{
		System.out.println("both string are not equal");
		
		}
	}
	}


