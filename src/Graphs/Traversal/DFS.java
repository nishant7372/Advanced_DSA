package Graphs.Traversal;

import java.util.ArrayList;

public class DFS {

    public ArrayList<Integer> dfs(int n, ArrayList<Integer>[] graph){
        boolean[] vis = new boolean[n];
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++) {
            if(!vis[i]) {
                vis[i] = true;
                dfs(vis, graph, i, res);
            }
        }
        return res;
    }

    private void  dfs(boolean[] vis,ArrayList<Integer>[] graph,int curr,ArrayList<Integer> res){
        res.add(curr);
        for(int x:graph[curr]){
            if(!vis[x]) {
                vis[x] = true;
                dfs(vis, graph, x, res);
            }
        }
    }
}
