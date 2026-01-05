package Imp_Programs;

public class Rev_Eachword_sameplace {

			public static void main(String[] args) {
				String s="my name is mithun";
				String[]str=s.split(" ");
				String result="";
				for(int i=0;i<str.length;i++) {
					String s1=str[i];
					for(int j=s1.length()-1;j>=0;j--) {
						result+=s1.charAt(j);
						
					}
					result+=" ";
					
				}
				System.out.println(result);
				
				

			}

		}


	


