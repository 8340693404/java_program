package Imp_Programs;

public class A_Sum_First_Half {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {2,4,6,8,4,5,7};
		int half=a.length/2;
		int sum=0;
		for(int i=0;i<half;i++) {
		
			sum+=a[i];
		}
		System.out.println(sum);
		

	}

}
