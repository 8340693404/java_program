package Imp_Programs;

public class A_Avg_Evev_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {4,6,8,10,12};
		int sum=0;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				count++;
				sum=sum+a[i];	
			}
			
		}
		int average = sum/count;
		System.out.println(average);

	}

}
