package Graphs.Dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkstra_Heap {
    // adj -> index(node) -> list of (node,cost)
    public int[] dijkstra(int n, ArrayList<ArrayList<ArrayList<Integer>>> adj, int src)
    {
        // int[]{cost, node}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0]==b[0]? a[1]-b[1] : a[0]-b[0]);

        int[] cost = new int[n];

        Arrays.fill(cost,(int)1e9);

        cost[src] = 0;

        pq.add(new int[]{0,src});

        while(!pq.isEmpty()){
            int[] curr = pq.remove();

            for(ArrayList<Integer> x: adj.get(curr[1])){
                int edgeCost = x.get(1);
                int adjNode = x.get(0);

                if(curr[0] + edgeCost < cost[adjNode]){
                    cost[adjNode] = curr[0] + edgeCost;
                    pq.add(new int[]{cost[adjNode],adjNode});
                }
            }
        }

        return cost;
    }

    public int[] dijkstra(int n, int[][] edges, int src) {
        @SuppressWarnings({"unchecked"})
        ArrayList<int[]>[] adj = new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i] = new ArrayList<>();
        }

        // adj -> index(node) -> list of (cost, node)
        for(int[] x:edges){
            adj[x[0]].add(new int[]{x[2],x[1]}); // cost, node
        }

        // int[]{cost, node}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]==b[0]? a[1]-b[1] : a[0]-b[0]);

        int[] cost = new int[n];

        Arrays.fill(cost,(int)1e9);

        cost[src] = 0;

        pq.add(new int[]{0,src});

        while(!pq.isEmpty()) {
            int[] curr = pq.remove();

            for (int[] x : adj[curr[1]]) {
                int edgeCost = x[0];
                int adjNode = x[1];

                if (curr[0] + edgeCost < cost[adjNode]) {
                    cost[adjNode] = curr[0] + edgeCost;
                    pq.add(new int[]{cost[adjNode], adjNode});
                }
            }
        }

        return cost;
    }

}
