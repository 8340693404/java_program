package Imp_Programs;

public class A_Sec_Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {6,5,7,8,};
		int min=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;
		for(int i =0;i<a.length;i++) {
			if(a[i]<min) {
				smin=min;
				min=a[i];
			}
			else if(a[i]<smin && a[i]!=min) {
				smin=a[i];
			}
		}
		System.out.println("SMAX:"+ smin);


	}

}
