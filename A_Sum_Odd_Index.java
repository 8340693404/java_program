package Imp_Programs;

public class A_Sum_Odd_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {9,5,3,4,5,8};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==1) {
				sum+=a[i];
			}
		}
		System.out.println(sum);

	}

}
