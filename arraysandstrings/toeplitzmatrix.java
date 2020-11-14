package arraysandstrings;

/*
 * 1. A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.
2. Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
 */
import java.util.*;

class toeplitzmatrix {

    public static boolean isToeplitzMatrix(int[][] matrix) {
      //Write your code here
    	for(int i=0;i<matrix.length;i++) {
    		for(int j=0;j<matrix[0].length;j++) {
    			if(i+1<matrix.length && j+1<matrix[0].length) {
    				if(matrix[i][j]!=matrix[i+1][j+1]) {
    					return false;
    				}
    				else {
    					continue;
    				}
    			}
    		}
    	}
    	return true;
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(isToeplitzMatrix(arr));
    }
}