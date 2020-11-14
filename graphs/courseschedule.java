package graphs;
import java.util.*;
//this quesn is equivalent to detecting cycle in a directed graph
public class courseschedule {

	static class Pair{
		int val;
		int pre;
		Pair(int val,int pre){
			this.val = val;
			this.pre = pre;
		}
	}
	
	public static boolean iscyclic(ArrayList<Pair> list,int i,boolean[] visited,boolean[] recstack) {
		if(recstack[i]) {
			return true;
		}
		if(visited[i]) {
			return false;
		}
		visited[i]=true;
		recstack[i]=true;
		for(Pair p:list) {
			if(iscyclic(list,p.pre,visited,recstack)) {
				return true;
			}
		}
		recstack[i]=false;
		return false;		
		
	}
	public static boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[] visited = new boolean[prerequisites.length];
        boolean[] recstack = new boolean[prerequisites.length];
        ArrayList<Pair> list = new ArrayList<>();
        for(int i=0;i<prerequisites.length;i++) {
        	Pair p = new Pair(prerequisites[i][0],prerequisites[i][1]);
        	list.add(p);
        }
        StringBuilder s = new StringBuilder("");
        
        
        for(int i=0;i<list.size();i++) {
        	if(iscyclic(list,i,visited,recstack)) {
            	return false;
            }
        }    
        
        return true;
        
		
    	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		for(int i=0;i<n;i++) {
			for(int j =0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(canFinish(n,arr));
	}

}
