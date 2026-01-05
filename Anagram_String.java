package Imp_Programs;

import java.util.Arrays;

public class Anagram_String {

	public static void main(String[] args) {
		String s1="read";
		String s2="dear";
		if(s1.length()==s2.length()) {
			char[]ch1=s1.toLowerCase().toCharArray();
			char[]ch2=s2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("anagram");
			}
			else
				System.out.println("not anagram");
		}

	}

}
