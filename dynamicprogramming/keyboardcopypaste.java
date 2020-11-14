package dynamicprogramming;
import java.util.*;

public class keyboardcopypaste {
	public static int minoperations(int n) {
		int res =0;
		for(int f=2;f*f<=n;f++) {
			int ctr=0;
			while(n%f==0) {
				ctr++;
				n=n/f;
			}
					
			res+=f*ctr;			
		}
		if(n>1) {
			res+=n;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(minoperations(n));
	}

}
