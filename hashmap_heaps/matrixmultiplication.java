package hashmap_heaps;

import java.util.*;
public class matrixmultiplication{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int arow= scn.nextInt();
        int acol= scn.nextInt();
        int[][] a= new int[arow][acol];
        for(int i=0;i<arow;i++){
            for(int j=0;j<acol;j++){
                a[i][j]=scn.nextInt();
            }
        }
        int brow= scn.nextInt();
        int bcol= scn.nextInt();
        int[][] b= new int[brow][bcol];
        for(int i=0;i<brow;i++){
            for(int j=0;j<bcol;j++){
                b[i][j]=scn.nextInt();
            }
        }
        int[][] res= new int[arow][bcol];
        res=multiply(a,b);    
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

    // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input two Sparse  2d Arrays, A and B
	 // Return their product
	 public static int[][] multiply(int[][] first, int[][] second) {
	 	 //Write your code here
		 int m=first.length;
		 int n=first[0].length;
		 int p=second.length;
		 int q=second[0].length;
		 int[][] multiply = new int[m][q];
		 int sum=0;
         for (int i = 0; i < m; i++)
         {
            for (int j = 0; j < q; j++)
            {  
               for (int k = 0; k < p; k++)
               {
                  sum = sum + first[i][k]*second[k][j];
               }
 
               multiply[i][j] = sum;
               sum = 0;
            }
         }
         return multiply;
				 
	 }

}
