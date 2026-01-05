package Imp_Programs;

public class Reverse_Each_Word_String {

	public static void main(String[] args) {
		
		//initialize the input string
		
		String input= "my name is mithun";
		
		//split the string into words using space as delimiter
		
		String[]words=input.split(" ");
		
		//create a stringbuilder to store the final result
		
		StringBuilder result= new StringBuilder();
		
		//loop through each word
		for(String word:words) {
			
			//reverse the current word
			String rev="";
			for(int i=word.length()-1;i>=0;i--) {
				rev+=word.charAt(i);
			}
			
			//append the reversed word and a space
			
				result.append(rev).append(" ");
				
			}
		
		//print the final result
		
			System.out.println(result.toString().trim());
		}
	}


