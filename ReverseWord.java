package Imp_Programs;

public class ReverseWord {

	public static void main(String[] args) {
		String input="my name is mithun";
		String[]s=input.split(" ");
		StringBuilder result= new StringBuilder();
		for(String s1:s) {
			String rev=" ";
			for(int i=s1.length()-1;i>=0;i--) {
				rev+=s1.charAt(i);
			}
			result.append(rev).append("");
		}
		System.out.println(result.toString().trim());

	}

}
