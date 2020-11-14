package graphs;
import java.util.*;

public class bfs {
	
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
		
		public static void printbfs() {
			Queue<Integer> q = new LinkedList<>();
			boolean[] visited = new boolean[graph.size()];
			q.add(0);
			visited[0]=true;
			while(q.size()>0) {
				int vertex = q.remove();
				System.out.print(vertex+" ");
				ArrayList<Edge> list = graph.get(vertex);
				for(int i=0;i<list.size();i++) {
					Edge e = list.get(i);
					if(!visited[e.nbr]) {
						q.add(e.nbr);
						visited[e.nbr]=true;						
					}
				}
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
			addEdge(4, 5, 3);
			addEdge(5, 6, 3);
			addEdge(4, 6, 8);
			
			printbfs();
			
			
		}
	

}
