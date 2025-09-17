package Graphs;

// Adjacency Matrix Representation of a graph
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

class Graph{
    int v;
    int[][] adj;

    Graph(int v){
        this.v = v;
        adj = new int[v][v];
    }

    void addDirectedEdge(int src, int dest, int cost){
        adj[src][dest] = cost;
    }

    void addUnDirectedEdge(int src, int dest, int cost){
        addDirectedEdge(src, dest, cost);
        addDirectedEdge(dest, src, cost);
    }

    void printGraph(){
        for(int i=0;i<v;i++){
            System.out.print("vertex "+i+" is connected to: ");
            for(int j=0; j<v; j++){
                if(adj[i][j] != 0)
                    System.out.print("("+j+", "+adj[i][j]+") ");
            }
            System.out.println();
        }
    }
}

public class Test3 {
    public static void main(String[] args) {
        Graph g = new Graph(4);

        // from vertex 0
        g.addUnDirectedEdge(0, 1, 1);
        g.addUnDirectedEdge(0, 2, 1);
        
        // from vertex 1
        g.addUnDirectedEdge(1, 2, 1);
        g.addUnDirectedEdge(1, 3, 1);
        
        // from vertex 2
        g.addUnDirectedEdge(2, 3, 1);
        
        g.printGraph();

    }
}
