package Graphs.ShortestPath.DAG;

import java.util.*;

public class Topological_Shortest_Path_Algorithm {

    public int[] shortestPath(int n, int[][] edges) {
        @SuppressWarnings({"unchecked"})
        ArrayList<int[]>[] adj = new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i] = new ArrayList<>();
        }
        for(int[] x:edges){
            adj[x[0]].add(new int[]{x[1],x[2]});
        }

        Stack<Integer> st = new Stack<>();
        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(vis,i,adj,st);
            }
        }

        int[] dist = new int[n];
        Arrays.fill(dist,(int)1e9);
        dist[0] = 0;
        while(!st.isEmpty()){
            int curr = st.pop();
            for(int[] x:adj[curr]){
                if(dist[curr]+x[1]<dist[x[0]]){
                    dist[x[0]] = dist[curr] + x[1];
                }
            }
        }

        for(int i=0;i<n;i++){
            if(dist[i]==(int)1e9){
                dist[i]=-1;
            }
        }

        return dist;
    }

    private void dfs(boolean[] vis,int curr,ArrayList<int[]>[] adj,Stack<Integer> st){
        if(vis[curr]){
            return;
        }
        vis[curr] = true;
        for(int[] x:adj[curr]){
            dfs(vis,x[0],adj,st);
        }
        st.push(curr);
    }
}
