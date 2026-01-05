package Imp_Programs;

public class A_Sum_Even_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {2,4,6,8,9};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				sum+=a[i];
			}
		}
			System.out.println(sum);
		}

	}


