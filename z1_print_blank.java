package Imp_Programs;

public class z1_print_blank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="ab ccba";
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				s=s.substring(0, i)+ s.substring(i+2);
				System.out.println(s);
				i=-1;
			}
		}

	}

}