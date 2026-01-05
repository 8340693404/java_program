package Imp_Programs;

public class Second_Max_Array {

	public static void main(String[] args) {
		int[]a= {200,40 ,300,300};
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				smax=max;
				max=a[i];
				
			}
			else if(a[i]>smax&&a[i]!=max){
				smax=a[i];
			}
		}
		System.out.println(max);
		System.out.println(smax);

	}

}
