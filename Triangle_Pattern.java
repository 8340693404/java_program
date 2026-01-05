package Imp_Programs;

public class Triangle_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=3;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				if(i>=j) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
