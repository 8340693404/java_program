package Imp_Programs;

public class A_Sec_Half_Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 4, 6, 8, 3, 5, 0};
	    int half = a.length / 2;
	    int sum=0;
	    int count=0;
	   
	    for (int i = half; i < a.length; i++) {
	    	count++;
	    	sum+=a[i];
		}
			int average = sum/count;
		
		System.out.println(average);

	    }

	}


