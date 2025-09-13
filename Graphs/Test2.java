package Graphs;

import java.util.LinkedList;

// Representation of graph:
// ~~~~~~~~~~~~~~~~~~~~~~~~
// 1) Adjacency list (list of lists)
// 2) Adjacency matrix (2-d array)


// Adjacency List Representation:
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

class Graph{
    static class Edge{
        int dest;
        int cost;

        Edge(int dest, int cost){
            this.dest = dest;
            this.cost = cost;
        }
    }

    int v;
    static LinkedList<LinkedList<Edge>> adj;
    
    Graph(int v){
        this.v = v;
        adj = new LinkedList<LinkedList<Edge>>();
        for(int i=0; i<v; i++)
            adj.add(new LinkedList<Edge>());
    }

    void addDirectedEdge(int src, int dest, int cost){
        Edge edge = new Edge(dest, cost);
        adj.get(src).add(edge);
    }

    void addUnDirectedEdge(int src, int dest, int cost){
        addDirectedEdge(src,dest,cost);
        addDirectedEdge(dest, src, cost);
    }

    void addDirectedEdge(int src, int dest){
        Edge edge = new Edge(dest,1);
        adj.get(src).add(edge);
    }

    void addUnDirectedEdge(int src, int dest){
        addDirectedEdge(src, dest, 1);
        addDirectedEdge(dest,src,1);
    }

    void printGraph(){
        for(int i=0; i<v; i++){
            LinkedList<Edge> temp = adj.get(i);
            System.out.print("vertex "+i+" is connected to => ");
            for(Edge e: temp)
                System.out.print("("+e.dest+", "+e.cost+")");
            System.out.println();
        }
    }
}

public class Test2 {
    public static void main(String[] args) {
        Graph g = new Graph(4);

        // from vertex 0
        g.addUnDirectedEdge(0,1,1);
        g.addUnDirectedEdge(1,  2, 1);

        // from vertex 1
        g.addUnDirectedEdge(1, 2,1);
        g.addUnDirectedEdge(1, 3, 1);

        // from vertex 2
        g.addUnDirectedEdge(2, 3, 1);

        g.printGraph();

    }
}
