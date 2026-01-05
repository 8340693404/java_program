package Imp_Programs;

public class A_Min_Sec_Half {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 4, 6, 8, 1, 5, 0};
	    int half = a.length / 2;
	    int min=a[0];
	    

	    for (int i = half; i < a.length; i++) {
	    	if(a[i]<min) {
	    		min=a[i];
	    	}
	        
	    }

	    System.out.println(min);
	

	}

}
