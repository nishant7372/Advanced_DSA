package Graphs.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class undirected_input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int m = scan.nextInt();
        int[][] edges = new int[m][2];

        for(int i=0;i<m;i++){
            edges[i][0] = scan.nextInt();
            edges[i][1] = scan.nextInt();
        }

        int[][] graph = matrixInput(n,edges);
        ArrayList<Integer>[] graph2 = arrayInput(n,edges);
        ArrayList<ArrayList<Integer>> graph3 = arrayListInput(n,edges);
        Map<Integer, ArrayList<Integer>> graph4 = mapInput(n,edges);
    }

    private static int[][] matrixInput(int n,int[][] edges){
        int[][] graph = new int[n][n];

        for(int[] edge: edges){
            graph[edge[0]][edge[1]] = 1;
            graph[edge[1]][edge[0]] = 1;
        }

        return graph;
    }


    private static ArrayList<Integer>[] arrayInput(int n,int[][] edges){
        @SuppressWarnings({"unchecked"})
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] edge: edges){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        return graph;
    }

    private static ArrayList<ArrayList<Integer>> arrayListInput(int n,int[][] edges){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        return graph;
    }
    private static Map<Integer, ArrayList<Integer>> mapInput(int n,int[][] edges) {
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();

        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], k -> new ArrayList<>());
            graph.get(edge[0]).add(edge[1]);
            graph.computeIfAbsent(edge[1], k -> new ArrayList<>());
            graph.get(edge[1]).add(edge[0]);
        }

        return graph;
    }

}
