package hashmap_heaps;



import java.util.*;
class project{
	int profit;
	int capital;
}

public class ipo {

	static class CapitalComparator implements Comparator<project>{
		public int compare(project p1,project p2) {
			return p1.capital-p2.capital;   //ascending order
		}
	}
	static class ProfitComparator implements Comparator<project>{
		public int compare(project p1,project p2) {
			return p2.profit-p1.profit;   //descending order
		}
	}
		
		

	 public static int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
	 	 //write your code here
		 project arr[] = new project[Profits.length];
		 for(int i=0;i<arr.length;i++) {
			 project p=new project();
			 p.profit=Profits[i];
			 p.capital=Capital[i];
			 arr[i]=p;
		 }
		 Arrays.sort(arr,new CapitalComparator());
		 PriorityQueue<project> q = new PriorityQueue<>(new ProfitComparator());
		 int i=0;
		 for(;i<arr.length;i++) {
			 int cap = arr[i].capital;
			 if(cap>W) {
				 break;
			 }
			 q.add(arr[i]);
		 }
		 while(k-- >0) {
			 project p = q.remove();
			 W+=p.profit;
			 
			 while(i<arr.length) {
				 int val = arr[i].capital;
				 if(val>W) {
					 break;
				 }
				 q.add(arr[i]);
				 i++;
			 }
		 }
		 return W;
		 
		 
	 }

	 // -----------------------------------------------------

	 public static void main(String[] args) {
	 	 Scanner sc = new Scanner(System.in);

	 	 int k = sc.nextInt();
	 	 int w = sc.nextInt();

	 	 int n = sc.nextInt();
	 	 int[] profits = new int[n];
	 	 int[] capital = new int[n];

	 	 for (int i = 0; i < n; i++) {
	 	 	 profits[i] = sc.nextInt();
	 	 }

	 	 for (int i = 0; i < n; i++) {
	 	 	 capital[i] = sc.nextInt();
	 	 }

	 	 System.out.println(findMaximizedCapital(k, w, profits, capital));

	 }

}
