//package linkedlists;
//
//import java.util.*;
//class stockspan{
//public static void calcspan(int[] price) {
//	int[] res = new int[price.length];
//	Stack<Integer> st = new Stack<>();
//	res[0]=1;
//	st.push(0);
//	for(int i=1;i<price.length;i++) {
//		while(!st.isEmpty() && price[st.peek()]<price[i]) {
//			st.pop();
//		}
//		if(!st.empty()) {
//			res[i]=i-st.peek();
//		}
//		else {
//			res[i]=0;
//		}
//		st.push(i);
//	}
//	for(int i=0;i<res.length;i++) {
//		System.out.println(res[i] + " ");
//	}
//}
//
//
//
//
//
//
//
//
//
//
//
//
////Dont make chamnges here
//	 public static void main(String[] args){
//	 	 
//	 	 Scanner sc=new Scanner(System.in);
//	 	 int n=sc.nextInt();
//	 	 int prices[] = new int[n];
//	 	 for(int i=0;i<n;i++){
//	 	 	 prices[i]=sc.nextInt();
//	 	 }
//	 	 calcspan(prices);
//	 	 
//	 }
//
//
//
//
//}








import java.util.*;
 class stockspan{
 static class StockSpanner {
 // Complete the functions
	 Stack<Integer> pricest,span;
     public StockSpanner() {
    	 pricest = new Stack<>();
    	 span = new Stack<>();
     }
 
     public int next(int price) {
    	 int s =1;
    	 while(!pricest.isEmpty() && pricest.peek()<price) {
    		 pricest.pop();
    		 s += span.pop();
    	 }
    	 pricest.push(price);
    	 span.push(s);
    	 return s;
     }
 
 } 
 
 
 //Dont make chamnges here
 	 public static void main(String[] args){
 	 	 StockSpanner ss=new StockSpanner();
 	 	 Scanner sc=new Scanner(System.in);
 	 	 int n=sc.nextInt();
 	 	 for(int i=0;i<n;i++){
 	 	 	 System.out.println(ss.next(sc.nextInt()));
 	 	 }
 	 }
 
 
 
 
 }
