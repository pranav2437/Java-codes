package hashmap_heaps;

import java.util.*;

import hashmap_heaps.sortonfreq.freqcompare;

class element{
	char val;
	int freq;
	element(char val,int freq){
		this.val=val;
		this.freq=freq;
	}
}
public class sortcharbyfreq {
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

    public static String frequencySort(String s) {
        //Write your code here
    	PriorityQueue<element> q = new PriorityQueue<>(new freqcompare());
    	HashMap<Character,Integer> map = new HashMap<>();
    	for(int i=0;i<s.length();i++) {
    		if(!map.containsKey(s.charAt(i))) {
    			map.put(s.charAt(i),1);
    		}
    		else {
    			map.put(s.charAt(i),map.get(s.charAt(i))+1);
    		}
    	}
    	for(int i=0;i<s.length();i++) {
    		element e = new element(s.charAt(i),map.get(s.charAt(i)));
    		q.add(e);    		
    	}
    	String str="";
    	while(!q.isEmpty()) {
    		str+=q.remove().val;
    	}
    	return str;
    }
    	
    

    //Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(frequencySort(sc.next()));
    }

}