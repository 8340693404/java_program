package Imp_Programs;

public class A_Min_Value_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {8,4,16,5,78};
		int min=a[0];
		for(int i=0;i<a.length;i=i+2) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);

	}

}
