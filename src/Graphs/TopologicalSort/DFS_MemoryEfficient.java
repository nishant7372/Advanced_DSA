package Graphs.TopologicalSort;

import java.util.ArrayList;
import java.util.Stack;

// Tested - GFG

class DFS_MemoryEfficient
{
    //Function to return list containing vertices in Topological order.
    public int[] topologicalSort(int n, ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] vis = new boolean[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(!vis[i]){
                vis[i] = true;
                dfs(adj,vis,i,st);
                st.push(i);
            }
        }
        int[] res = new int[n];

        int i=0;
        while(!st.isEmpty()){
            res[i++] = st.pop();
        }
        return res;
    }

    private void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int curr,Stack<Integer> st){
        for(int x:adj.get(curr)){
            if(!vis[x]){
                vis[x] = true;
                dfs(adj,vis,x,st);
                st.push(x);
            }
        }
    }
}
