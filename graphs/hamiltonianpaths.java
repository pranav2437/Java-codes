package graphs;
import java.util.*;
//hamiltonian path: path by which we can visit all the vertices without visiting any vertex more than once
//hamiltonian cycle: hamiltonian path in which the first and last vertex are directly connected by an edge

public class hamiltonianpaths {
		
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
		
		public static void printhamiltonianpath(int s,boolean[] visited,int vsf,String psf) {
			if(vsf==graph.size()-1) {         //tumpr aane se pehle n-1 visit ho chuke hain,means u are nth
				System.out.println(psf + s);
				return;
			}
			visited[s]=true;
			for(int n=0;n<graph.get(s).size();n++) {
				Edge e = graph.get(s).get(n);
				if(!visited[e.nbr]) {
					printhamiltonianpath(e.nbr,visited,vsf+1,psf+s);
				}
			}
			visited[s]=false;
		}
		
		public static void printhamiltoniancycle(int s,boolean[] visited,int vsf,String psf,int ogsource) {
			if(vsf==graph.size()-1 ) {         //tumpr aane se pehle n-1 visit ho chuke hain,means u are nth
				for(int n=0;n<graph.get(s).size();n++) {
					Edge e = graph.get(s).get(n);
					if(e.nbr==ogsource) {
						System.out.println(psf + s);
					}
				}				
				return;
			}
			visited[s]=true;
			for(int n=0;n<graph.get(s).size();n++) {
				Edge e = graph.get(s).get(n);
				if(!visited[e.nbr]) {
					printhamiltoniancycle(e.nbr,visited,vsf+1,psf+s,ogsource);
				}
			}
			visited[s]=false;
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
			//printhamiltonianpath(0,new boolean[graph.size()],0,"");
			printhamiltoniancycle(0,new boolean[graph.size()],0,"",0);
			
		}
	

}
