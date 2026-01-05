package Imp_Programs;

import java.util.LinkedHashMap;

public class Occurence_String {
	public static void main(String[] args) {
		String s="aaabnvgsnn";
		LinkedHashMap<Character, Integer>hash=new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(hash.containsKey(ch)) {
				hash.put(ch,hash.get(ch)+1);
				}
		
			else 
				hash.put(ch,1);
			}
			System.out.println(hash);
		}
		
		
		
	}


