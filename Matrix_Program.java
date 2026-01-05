package Imp_Programs;

public class Matrix_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] a = {
            {1, 0, 0, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 0},
            {1, 1, 1, 1}
        };

        int rows = a.length;
        int cols = a[0].length;

        boolean[] row = new boolean[rows];
        boolean[] col = new boolean[cols];

        // Step 1: mark rows and columns having 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (a[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (row[i] || col[j]) {
                    a[i][j] = 0;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

	}

}
