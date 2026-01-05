package Imp_Programs;

public class A_Sec_Half_Max {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int[] a = {2, 4, 6, 8, 1, 5, 0};
    int half = a.length / 2;
    int max=a[0];
    

    for (int i = half; i < a.length; i++) {
    	if(a[i]>max) {
    		max=a[i];
    	}
    }
    System.out.println(max);
    	

}
    }
