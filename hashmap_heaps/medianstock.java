package hashmap_heaps;
import java.util.*;

class MedianFinder {
    PriorityQueue<Integer> minHeap = null;
    PriorityQueue<Integer> maxHeap = null;
 
    
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }
 
    public void addNum(int num) {
        minHeap.add(num);
        maxHeap.add(minHeap.poll());
 
        if(minHeap.size()<maxHeap.size()){
            minHeap.add(maxHeap.poll());
        }
    }
 
    public double findMedian() {
        if(minHeap.size() > maxHeap.size()){
            return minHeap.peek();
        }else {
            return (minHeap.peek()+maxHeap.peek())/2.0;
        }
    }
}
public class medianstock {
	
	public static void main(String[] args) {
	 	 Scanner sc = new Scanner(System.in);
	 	 int n = sc.nextInt();
	 	 double[] res = new double[n];
	 	 int[] input = new int[n];
	 	MedianFinder m = new MedianFinder();
	 	 for(int i=0;i<n;i++) {
	 		input[i]=sc.nextInt();
	 	 }
	 	
	 	 for(int i=0;i<n;i++) {
	 		m.addNum(input[i]);
	 		res[i]=m.findMedian();
	 	 }
	 		
	 	for(int i=0;i<res.length;i++) {
	 		System.out.println(res[i]);
	 	} 		
	 		
	 	 
	  }
}
