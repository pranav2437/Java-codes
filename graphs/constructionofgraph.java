package graphs;
import java.util.*;

public class constructionofgraph {

	
	static class Edge{
		int nbr;
		int wt;
		Edge(int nbr,int wt){
			this.nbr=nbr;
			this.wt=wt;
		}
	}
	
	static ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
	
	public static void addEdge(int v1,int v2,int wt) {
		Edge e1 = new Edge(v2,wt);
		ArrayList<Edge> list1 = graph.get(v1);
		list1.add(e1);
		graph.set(v1, list1);
		
		Edge e2 = new Edge(v1,wt);
		ArrayList<Edge> list2 = graph.get(v2);
		list2.add(e2);
		graph.set(v2, list2);
		
	}
	
	public static void displaygraph() {
		for(int i=0;i<graph.size();i++) {
			System.out.print(i + " -> ");
			for(int j=0;j<graph.get(i).size();j++) {
				Edge e = graph.get(i).get(j);
				System.out.print("[" + e.nbr + "-" + e.wt + "], " );
			}
			System.out.println();
		}
	}
	
	public static boolean isdirectlyconnected(int v1,int v2) {
		ArrayList<Edge> list = graph.get(v1);
		for(int i=0;i<list.size();i++) {
			Edge e = list.get(i);
			if(e.nbr==v2) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean haspath(int s,int d, boolean[] visited) {     //s=source, d=destination
		if(s==d) {
			return true;
		}
		visited[s]=true;                                    
		for(int n=0;n<graph.get(s).size();n++) {
			Edge e = graph.get(s).get(n);
			if(visited[e.nbr]==false) {                                //call only for unvisited nbrs
				boolean haspathfromntod = haspath(e.nbr,d,visited);
				if(haspathfromntod==true) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void printpaths(int s,int d,String psf,boolean[] visited,int depth) {
		
		if(s==d) {
			System.out.println(psf + d + " @ " + depth);
		}
		visited[s]=true;
		for(int n=0;n<graph.get(s).size();n++) {
			Edge e = graph.get(s).get(n);
			if(visited[e.nbr]==false) {
				printpaths(e.nbr,d,psf+s + "->",visited,depth+e.wt);
			}
		}
		visited[s]=false;
		
	}
	static int sd = Integer.MAX_VALUE;
	static String sdp = "";
	public static void shortestpath(int s,int d,String psf,boolean[] visited,int distance) {
		if(s==d) {
			psf+=d;
			if(distance<sd) {
				sd = distance;
				sdp=psf;				
			}
			return;
		}
		visited[s]=true;
		for(int n=0;n<graph.get(s).size();n++) {
			Edge e = graph.get(s).get(n);
			if(!visited[e.nbr]) {
				shortestpath(e.nbr,d,psf+s,visited,distance + e.wt);
			}
		}
		visited[s]=false;
	}
	static int cd = Integer.MAX_VALUE;
	static int temp1 =0;
	static String cp ="";
	static int fd = Integer.MIN_VALUE;
	static int temp2 = 0;
	static String fp = "";
	public static void ceilndfloorpath(int s,int d,String psf,boolean[] visited,int dist,int factor) {
		if(s==d) {
			if(dist>factor) {
				temp1 = dist;
				if(cd>temp1) {
					cd = temp1;
					cp=psf;
				}
			}
			if(dist<factor) {
				temp2 = dist;
				if(fd<temp2) {
					fd = temp2;
					fp = psf;
				}
			}
			return;
		}
		
		visited[s]=true;
		for(int n=0;n<graph.get(s).size();n++) {
			Edge e = graph.get(s).get(n);
			if(!visited[e.nbr]) {
				ceilndfloorpath(e.nbr,d,psf+s,visited,dist+e.wt,factor);
			}
		}
		visited[s]=false;
		
	}
	public static void main(String[] args) {
		
		graph.add(new ArrayList<Edge>());
		graph.add(new ArrayList<Edge>());
		graph.add(new ArrayList<Edge>());
		graph.add(new ArrayList<Edge>());
		graph.add(new ArrayList<Edge>());
		graph.add(new ArrayList<Edge>());
		graph.add(new ArrayList<Edge>());
		
		addEdge(0, 1, 10);
		addEdge(1, 2, 10);
		addEdge(2, 3, 10);
		addEdge(0, 3, 40);
		addEdge(3, 4, 2);
		addEdge(2, 5, 5);		
		addEdge(4, 5, 3);
		addEdge(5, 6, 3);
		addEdge(4, 6, 8);
		
		
		//displaygraph();
		//System.out.println(isdirectlyconnected(0,3));
		
		System.out.println(haspath(0,6,new boolean[graph.size()]));
		printpaths(0,6,"",new boolean[graph.size()],0);
		shortestpath(0,6,"",new boolean[graph.size()],0);
		System.out.println("smallest path: " + sdp + " @ " + sd);
		ceilndfloorpath(0,6,"",new boolean[graph.size()],0,50);
		System.out.println("ceil: " + cp + " @ " + cd);
		System.out.println("floor: " + fp + " @ " + fd);
		
	}
}
