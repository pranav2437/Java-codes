package arraysandstrings;
import java.util.*;
/*
 * Question: given a string and an integer k, you need to make a lexicographically min string from the
 * given string by operation: in one operation you can remove only 1 character from atmost first k chars
 * of the given string. you need to do 'n' such operations. Return the minimum string that can be formed.
 */
public class sprinklrtestques {

	
	public static String solve(String s,int k) {
		String res = ""; 
		PriorityQueue<Character> q = new PriorityQueue<>();	
		for(int i=0;i<k;i++){
				q.add(s.charAt(i));
		}
        while (q.size()>0) {   
            char temp =q.poll();
            //System.out.println(temp);
            res = res + temp; 
           //System.out.println(res);
            if(s.length()>k) {
            	q.add(s.charAt(k));
            }
            for (int i = 0; i < k; i++) { 
                if (s.charAt(i) == temp) {   
                    s = s.substring(0, i) + s.substring(i + 1);                    
                    break; 
                } 
            } 
        } 
  
        return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k=sc.nextInt();
		System.out.println(solve(s,k));
	}
}
