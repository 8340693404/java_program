package Imp_Programs;

import java.util.Arrays;

public class Sum_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {2,4,6};
		int[]b= {1,3,5,7};
		int max=Math.max(a.length,b.length);
		int[]sum=new int[max];
		for(int i=0;i<max;i++) {
			if(i<a.length) {
				sum[i]+=a[i];
			}
			if(i<b.length) {
				sum[i]+=b[i];
			}
		}
		System.out.println(Arrays.toString(sum));

	}

}
