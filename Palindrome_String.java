package Imp_Programs;

public class Palindrome_String {
	public static void main(String[] args) {
		String s="mam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			
			char ch=s.charAt(i);
			rev+=ch;
			
		}
		if(rev.equals(s))
		{
			System.out.println( "palindrome");
		}
		else
			System.out.println("not palindrome");
	}

}
