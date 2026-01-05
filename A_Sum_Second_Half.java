package Imp_Programs;

public class A_Sum_Second_Half {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		    int[] a = {2, 4, 6, 8, 4, 5, 7};
		    int half = a.length / 2;
		    int sum = 0;

		    for (int i = half; i < a.length; i++) {
		        sum += a[i];
		    }

		    System.out.println("Second half sum: " + sum);
		}


	}


