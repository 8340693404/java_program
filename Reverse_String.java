package Imp_Programs;

public class Reverse_String {
	public static void main(String[] args) {
		String s="India";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			 char ch=s.charAt(i);
			rev+=ch; //rev=rev+ch;	
		}
		System.out.println(rev);
	}

}
