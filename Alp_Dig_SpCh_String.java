package Imp_Programs;

public class Alp_Dig_SpCh_String {

	public static void main(String[] args) {
		String s="123mj&%";
		int alpha=0;
		int digit=0;
		int specchar=0;
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9') {
				digit++;
			}
			else if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')) {
				alpha++;
				
			}
			else
				specchar++;
		}
		System.out.println("Alpha:"+alpha);
		System.out.println("Digit:"+digit);
		System.out.println("SpeChar:"+specchar);

	}

}
