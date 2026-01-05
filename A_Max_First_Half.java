package Imp_Programs;

public class A_Max_First_Half {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {2,1,6,8,4,1,7};
		int half=a.length/2;
		int max=a[0];
		for(int i=0;i<half;i++) {
			if(a[i]>max) {
				max=a[i];
				
			}
		
			
		}
		System.out.println(max);
		

	}

}
