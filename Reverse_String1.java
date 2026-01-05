package Imp_Programs;

public class Reverse_String1 {
	public static void main(String[] args) {
		String s="india";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			System.out.println(ch);
		}
	}

}
