package Imp_Programs;

public class Reverse_Full_Sentence_String {

	public static void main(String[] args) {
		
		//initialize the input string
		
		String s= "my name is mithun";
		
		//create an empty string to hold the reversed result
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
	          rev+=s.charAt(i);
		}
		
		//print the reversed string
		
		System.out.println(rev);

	}

}
