package arraysandstrings;

import java.util.*;

public class magicsquare {
	  public static void main(String[] args) {
	  	  Scanner scn = new Scanner(System.in);
	  	  int r = scn.nextInt();
	  	  int c = scn.nextInt();
	  	  int[][] Input = new int[r][c];
	  	  for (int i = 0; i < r; i++) {
	  	  	  for (int j = 0; j < c; j++) {
	  	  	  	  Input[i][j] = scn.nextInt();
	  	  	  }
	  	  }
	  	  System.out.print(numMagicSquaresInside(Input));
	  }

	  // -----------------------------------------------------
	  // This is a functional problem. Do not make changes to main
	  // This function takes as input an array and integer k.
	  // It should print required output.
	  public static boolean isvalid(int[][] arr,int r,int c) {
		  if(r<0 || r+2>=arr.length || c<0 || c+2>=arr[0].length) {
			  return false;
		  }
		  int rsum1 =arr[r][c]+arr[r][c+1]+arr[r][c+2];
		  int rsum2 =arr[r+1][c]+arr[r+1][c+1]+arr[r+1][c+2];
		  int rsum3 =arr[r+2][c]+arr[r+2][c+1]+arr[r+2][c+2];
		  if(rsum1!=rsum2 || rsum2!=rsum3) {
			  return false;
		  }
		  
		  int csum1 = arr[r][c] + arr[r+1][c] + arr[r+2][c];
		  int csum2 = arr[r][c+1] + arr[r+1][c+1] + arr[r+2][c+1];
		  int csum3 = arr[r][c+2] + arr[r+1][c+2] + arr[r+2][c+2];
		  
		  if(csum1!=csum2 || csum2!=csum3) {
			  return false;
		  }
		  int dsum1 = arr[r][c] + arr[r+1][c+1] + arr[r+2][c+2];
		  int dsum2 = arr[r][c+2] + arr[r+1][c+1] + arr[r+2][c];
		  if(dsum1!=dsum2) {
			  return false;
		  }
		  return true;
		  
	  }
	  public static int numMagicSquaresInside(int[][] grid) {
	  	  // Write your code here
		  int count=0;
		  for(int i=0;i<grid.length;i++) {
			  for(int j=0;j<grid[0].length;j++) {
				  if(i+1<grid.length && j+1<grid[0].length) {
					  if(grid[i+1][j+1]==5) {
						  if(isvalid(grid,i,j)) {
							  count++;
						  }
					  }
					  else {
						  continue;
					  }  
				  }
				  
			  }
		  }
		  return count;
		  
	  }
}
