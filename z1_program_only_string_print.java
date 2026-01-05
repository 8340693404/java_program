package Imp_Programs;

public class z1_program_only_string_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abccba";
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(i-1)) {
				s=s.substring(0, i-1)+ s.substring(i+1);
				System.out.println(s);
				i=0;
			}
		}

	}

}
