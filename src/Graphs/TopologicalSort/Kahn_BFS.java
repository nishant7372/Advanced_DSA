package Graphs.TopologicalSort;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Kahn_BFS
{
    //Function to return list containing vertices in Topological order.
    public int[] topologicalSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        int[] inDegree = new int[V];

        for(ArrayList<Integer> list: adj){
            for(int x:list){
                inDegree[x]++;
            }
        }

        Queue<Integer> queue = new ArrayDeque<>();

        for(int i=0;i<V;i++){
            if(inDegree[i]==0){
                queue.add(i);
            }
        }

        int[] res = new int[V];
        int k=0;

        while(!queue.isEmpty()){
            int curr = queue.remove();
            res[k++] = curr;

            for(int x:adj.get(curr)){
                if(--inDegree[x]==0){
                    queue.add(x);
                }
            }
        }

        return res;
    }
}

