package Imp_Programs;

public class A_Array_Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {8,9,8,10,9,86};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
			int average = sum/a.length;
		
		System.out.println(average);

	}

}
