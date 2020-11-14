package hashmap_heaps;

import java.util.*;

public class validsudoku {
    
    // This is a functional problem. You have to complete this function.
    // It takes as input a 2D array of characters. It should return true if the
    // board is valid, else should return false.
    public static boolean isValidSudoku(char[][] board) {
        // write your code here.
    	int[] r = new int[9];                       //make row,col,submatrix arrays to check for duplicacy
    	int[] c = new int[9];
    	int[][] submatrix = new int[3][3];
    	for(int i=0;i<board.length;i++) {
    		for(int j=0;j<board[0].length;j++) {
    			if(board[i][j]=='.') {
    				continue;
    			}
    			int val=board[i][j]-'0';          //if value is 6,set 6th bit in row,col submatrix
    			if((r[i] & (1<<val))!=0) {        //check if already set       
    				return false;
    			}
    			else {
    				r[i] = (r[i] | (1<<val));     //set this bit
    			}
    			if((c[j] & (1<<val))!=0) {
    				return false;
    			}
    			else {
    				c[j] = (c[j] | (1<<val));       //similar for col,submatrix
    			}
    			if((submatrix[i/3][j/3] & (1<<val))!=0) {
    				return false;
    			}
    			else {
    				submatrix[i/3][j/3] |= (1<<val);
    			}
    		}
    	}
    	return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] board = new char[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }
        if (isValidSudoku(board)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }

}
