package Imp_Programs;

import java.util.LinkedHashSet;

public class Remove_Duplicate_String {
	public static void main(String[] args) {
		String s= "aaddccveek";
		LinkedHashSet set = new LinkedHashSet();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		System.out.println(set);
	}

}
