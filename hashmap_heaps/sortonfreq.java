package hashmap_heaps;

import java.util.*;

class element{
	int val;
	int freq;
	element(int val,int freq){
		this.val=val;
		this.freq=freq;
	}
}

class sortonfreq {

	static class freqcompare implements Comparator<element>{
		public int compare(element e1,element e2) {
			if(e1.freq!=e2.freq) {
				return e2.freq-e1.freq;
			}
			else {
				return e1.val-e2.val;
			}
		}
	}
    static void sortByFreq(int arr[], int n) {
        // Write your code here
    	PriorityQueue<element> q = new PriorityQueue<>(new freqcompare());
    	HashMap<Integer,Integer> map = new HashMap<>();
    	for(int i=0;i<arr.length;i++) {
    		if(!map.containsKey(arr[i])) {
    			map.put(arr[i],1);
    		}
    		else {
    			map.put(arr[i],map.get(arr[i])+1);
    		}
    	}
    	for(int i=0;i<arr.length;i++) {
    		element e = new element(arr[i],map.get(arr[i]));
    		q.add(e);    		
    	}
    	while(!q.isEmpty()) {
    		System.out.print(q.remove().val);
    	}
    	
    }

    //Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sortByFreq(arr, N);
    }
}
