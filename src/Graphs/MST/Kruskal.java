package Graphs.MST;

import java.util.Arrays;

// Sort the array of edges according to the weight of the edges.
// Include edge only when it does not form the cycle with the existing graph.

public class Kruskal {

    public int Kruskal(int n,int[][] edges){
        int sum=0;
        Arrays.sort(edges, (a,b) -> Integer.compare(a[2],b[2]));
        int[] parent = new int[n];
        for(int i=0;i<n;i++){
            parent[i] = i;
        }
        for(int[] x:edges){
            if(!cycleFormed(x,parent)){
                sum+=x[2];
            }
        }
        return sum;
    }

    private boolean cycleFormed(int[] edge,int[] parent){
        int a = findSuperParent(edge[0],parent);
        int b = findSuperParent(edge[1],parent);

        if(a==b){
            return true;
        }
        else{
            parent[a] = b;
            return false;
        }
    }

    private int findSuperParent(int x,int[] parent){
        return parent[x]==x? x : (parent[x] = findSuperParent(parent[x],parent));
    }
}
