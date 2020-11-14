package hashmap_heaps;

import java.util.*;

public class ratinjungle {

    public static int numRats(int[] answers) {
        // Write your code here
    	HashMap<Integer,Integer> map = new HashMap<>();
    	int total =0;
    	for(int i=0;i<answers.length;i++) {
    		if(!map.containsKey(answers[i])) {
    			map.put(answers[i],1);
    		}
    		else {
    			map.put(answers[i],map.get(answers[i])+1);
    		}
    	}
    	Set<Integer> colors = map.keySet();
    	for(int k: colors) {
    		if(map.containsKey(k) && k+1>=map.get(k)) {
    			total+=k+1;
    		}
    		else {
    			double val = (k+1)* Math.ceil(map.get(k)/(k+1));
    			total +=(int)val;
    		}
    	}
    	return total;
    }

    //Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] answers = new int[sc.nextInt()];
        for (int i = 0; i < answers.length; i++) {
            answers[i] = sc.nextInt();
        }
        System.out.println(numRats(answers));
    }

}
