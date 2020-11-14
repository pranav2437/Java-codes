package hashmap_heaps;



import java.util.*;

public class sweetsandfestival {

	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input the head of the linked list.
	 // It should return the head of the modified list.

	 public static boolean sweetandfestival(int n, int[] sweets, int k) {
	 	 //write your code here
		 HashMap<Integer,Integer> map = new HashMap<>();
		 for(int i =0;i<n;i++) {
			 if(!map.containsKey(sweets[i])) {
				 map.put(sweets[i],1);
			 }
			 else {
				 map.put(sweets[i],map.get(sweets[i])+1);
			 }
		 }
		 int max= Integer.MIN_VALUE;
		 for(int i:map.keySet()) {
			 if(map.get(i)>max) {
				 max=map.get(i);
			 }
			 else {
				 continue;
			 }
		 }
		 if(max>2*k) {
			 return false;
		 }
		 return true;
	 }

	 // -----------------------------------------------------

	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);

	 	 int n = scn.nextInt();
	 	 int[] num = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 num[i] = scn.nextInt();
	 	 }
	 	 int k = scn.nextInt();

	 	 boolean x = sweetandfestival(n, num, k);
	 	 if (x == true) {
	 	 	 System.out.println("1");
	 	 } else {
	 	 	 System.out.println("0");
	 	 }

	 }

}
