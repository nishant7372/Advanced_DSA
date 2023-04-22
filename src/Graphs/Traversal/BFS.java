package Graphs.Traversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BFS {
    public ArrayList<Integer> bfs(int n, ArrayList<Integer>[] graph){
        boolean[] vis = new boolean[n];
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++) {
            if(!vis[i]) {
                bfs(vis, graph, i, res);
            }
        }
        return res;
    }

    private void bfs(boolean[] vis,ArrayList<Integer>[] graph,int curr,ArrayList<Integer> res){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(curr);
        vis[curr] = true;
        while(!queue.isEmpty()){
            curr = queue.remove();
            res.add(curr);

            for(int x: graph[curr]){
                if(!vis[x]){
                    vis[x] = true;
                    queue.add(x);
                }
            }
        }
    }
}
