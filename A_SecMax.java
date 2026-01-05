package Imp_Programs;

public class A_SecMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {5,6,7,8};
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				smax=max;
				max=a[i];
				
			}
			else if(a[i]>smax && a[i]!=max) {
				smax=a[i];
			}
		}
		System.out.println("SMAX:"+ smax);

	}

}
