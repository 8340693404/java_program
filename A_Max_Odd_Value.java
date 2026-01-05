package Imp_Programs;

public class A_Max_Odd_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {3,45,4,6,7,86};
		int max=a[0];
		for(int i=1;i<a.length;i=i+2) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
