package Imp_Programs;

public class Expand_String {

	public static void main(String[] args) {
		String s="a3b2a1c1";
		for(int i=0;i<s.length();i=i+2) {
			int count=s.charAt(i+1)-48;   //48-:used for convert character to integer..
			char ch=s.charAt(i);
			for(int j=1;j<=count;j++) {
				System.out.println(ch);
			}
			
		}

	}

}
