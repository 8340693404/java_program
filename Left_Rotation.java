package Imp_Programs;

import java.util.Arrays;

public class Left_Rotation {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		for(int j=1;j<=2;j++) {   //for multiple rotation
		int num=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
			
		}
		arr[arr.length-1]=num;
		}
	System.out.println(Arrays.toString(arr));

	}
	
}
