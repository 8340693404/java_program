package Imp_Programs;

public class A_Rev_First_Half {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,1,6,8,4,1,7};
		int half=arr.length/2;
		for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

	}

}
