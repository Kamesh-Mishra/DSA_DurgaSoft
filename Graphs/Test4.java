package Graphs;

import java.util.LinkedList;

// Graph Traversal 
// ---------------
// visiting every vertex is called as graph traversal

// DFS and BFS

class Graph1{
	static class Edge{
		int dest;
		int cost;
		
        Edge(int dest,int cost){
			this.dest = dest;
			this.cost = cost;
		}
	}
	int v;
	static LinkedList<LinkedList<Edge>> adj;
	
    Graph1(int v){
		this.v = v;
		adj = new LinkedList<LinkedList<Edge>>();
		for(int i=0;i<v;i++)
			adj.add(new LinkedList<Edge>());
	}


	void addDirectedEdge(int src,int dest,int cost){
		Edge edge = new Edge(dest,cost);
		adj.get(src).add(edge);
	}
	void addUnDirectedEdge(int src,int dest,int cost){
		addDirectedEdge(src,dest,cost);
		addDirectedEdge(dest,src,cost);
	}
	void addDirectedEdge(int src,int dest){
		Edge edge = new Edge(dest,1);
		adj.get(src).add(edge);
	}
	void addUnDirectedEdge(int src,int dest){
		addDirectedEdge(src,dest,1);
		addDirectedEdge(dest,src,1);
	}
	void printGraph(){
		for(int i=0;i<v;i++){
			LinkedList<Edge> temp = adj.get(i);
			System.out.print("vertex "+i+" is connected to=> ");
			for(Edge e : temp){
				System.out.print("("+e.dest+", "+e.cost+") ");
			}
			System.out.println();
		}
	}
	
	static void bfs(Graph1 g,int source){
		int v = g.v;
		boolean[] visited = new boolean[v];
		LinkedList<Integer> q = new LinkedList<Integer>();
		q.add(source);
		visited[source]=true;
		while(!q.isEmpty()){
			int curr = q.remove();
			System.out.print(curr+" ");
			LinkedList<Edge> temp = g.adj.get(curr);
			for(Edge e:temp){
				if(visited[e.dest]==false){
					visited[e.dest] = true;
					q.add(e.dest);
				}
			}
		}
	}
	static void dfs(Graph1 g,int curr,boolean[] visited){
		System.out.print(curr+" ");
		visited[curr] = true;
		LinkedList<Edge> temp = g.adj.get(curr);
		for(Edge e:temp){
			if(visited[e.dest]==false){
				dfs(g,e.dest,visited);
			}
		}
	}
}

public class Test4 {
    public static void main(String[] args) {
        Graph1 g = new Graph1(5);
        g.addUnDirectedEdge(0, 1);
        g.addUnDirectedEdge(1, 2);
        g.addUnDirectedEdge(1, 4);
        g.addUnDirectedEdge(2, 3);
        g.addUnDirectedEdge(3, 4);

        g.printGraph();

        System.out.print("BFS : ");
        Graph1.bfs(g, 0);     // BFS:  0 1 2 4 3
        System.out.println();
        System.out.print("DFS : ");
        Graph1.dfs(g, 0, new boolean[g.v]);   // DFS : 0 1 2 3 4
        
        System.out.println();
        System.out.println("*******************************************");

        Graph1 g2 = new Graph1(4);
        g2.addUnDirectedEdge(0, 1);
        g2.addUnDirectedEdge(0, 2);
        g2.addUnDirectedEdge(1, 2);
        g2.addUnDirectedEdge(2, 3);

        g2.printGraph();

        System.out.print("BFS : ");
        Graph1.bfs(g2,0);     // BFS: 0 1 2 3
        System.out.println();
        System.out.print("DFS: ");
        Graph1.dfs(g2,0, new boolean[g2.v]);    // DFS: 0 1 2 3

    }
}
