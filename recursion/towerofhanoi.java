package recursion;
import java.util.*;

public class towerofhanoi {
	
	public static void toh(int n, char source, char destination, char auxiliary) {
		if(n==0) {
			return;
		}
		toh(n-1,source,auxiliary,destination);
		System.out.println("Move disc " + n + " from" + source + " to " + destination);
		toh(n-1,auxiliary,destination,source);
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		toh(n,'A','B','C');
	}
}
