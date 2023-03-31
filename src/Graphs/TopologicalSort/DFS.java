package Graphs.TopologicalSort;

import java.util.ArrayList;
import java.util.Stack;

public class DFS {
    //Function to return list containing vertices in Topological order.
    public int[] topologicalSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] vis = new boolean[V];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(i,vis,adj,st);
            }
        }

        int[] res = new int[st.size()];
        int i=0;
        while(!st.isEmpty()){
            res[i++] = st.pop();
        }
        return res;
    }


    private static void dfs(int node, boolean[] vis,ArrayList<ArrayList<Integer>> adj, Stack<Integer> st){
        if(vis[node]){
            return;
        }
        vis[node] = true;
        for(int x:adj.get(node)){
            dfs(x,vis,adj,st);
        }
        st.push(node);
    }
}
