package Imp_Programs;

public class A_Avg_First_Half {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {5,4,6,8,4,1,7};
		int half=a.length/2;
		int sum=0;
		int count=0;
		for(int i=0;i<half;i++) {
			count++;
			sum+=a[i];
		}
			int average = sum/count;
		
		System.out.println(average);

		}

	}


