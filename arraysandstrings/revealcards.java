package arraysandstrings;

import java.util.*;

public class revealcards {

	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input a deck of cards
	 // It should return the answer deck   7	17 	13 	11  2 	3 	5 	7
	 public static int[] deckRevealedIncreasing(int[] deck) {
	 	 //write code here
		 Queue<Integer> q = new LinkedList<>();
		 int[] res = new int[deck.length];
		 int n=deck.length;
		 for(int i=0;i<n;i++) {
			 q.add(i);
		 }
		 Arrays.sort(deck);
		 
		 int i=0;
		 while(q.size()>0) {
			 if(q.peek()!=null) {
				 int val = q.poll();				 
				 res[val] = deck[i];
			 }			 
			 i++;
			 if(q.peek()!=null) {
				 int val=q.poll();
				 q.add(val);
			 }
		 }
		 return res;
		 
	 }
	 // -----------------------------------------------------

	 public static void main(String[] args) {
	 	 Scanner sc = new Scanner(System.in);

	 	 int n = sc.nextInt();
	 	 int[] arr = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 arr[i] = sc.nextInt();
	 	 }

	 	 int[] ans = deckRevealedIncreasing(arr);
	 	 for (int i=0;i<ans.length;i++) {
	 	 	 System.out.print(ans[i] + " ");
	 	 }
	 }

}
