package Imp_Programs;

import java.util.TreeSet;

public class Second_Max_with_Collection {

	public static void main(String[] args) {
		int []a= {10,30,70,80,20};
		TreeSet set=new TreeSet();
		for(int b:a) {
			set.add(b);
		}
		System.out.println(set);
		int smax=set.size()-1;
		int count=1;
		for(Object obj:set) {
			if(count==smax) {
				System.out.println(obj);
			}
			count++;
		}
		
		
		

	}

}
