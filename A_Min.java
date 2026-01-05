package Imp_Programs;

public class A_Min {

	public static void main(String[] args) {
		int[]a= {4,7,8,9};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);

	}

}
