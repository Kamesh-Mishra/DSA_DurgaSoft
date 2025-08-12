package BackTracking;

// Grid ways:
// ----------
// Find number of ways to reach from (0,0) to (N-1,N-1) in a NxN grid matrix

// allowed moves are ----> right or down

public class Test5 {
    public static int gridWays(int i, int j, int n, int m){
        // base
        if(i==n-1 && j==m-1)
            return 1;
        else if(i==n || j==m)
            return 0;
        int value1 = gridWays(i+1, j, n, m);
        int value2 = gridWays(i, j+1, n, m);
        return value1+value2;
    }

    public static void main(String[] args){
        int n=4, m=4;
        System.out.println(gridWays(0, 0, n, m));
    }
}
