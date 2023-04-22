package Graphs.Input;

import java.util.*;

public class weighted_undirected_input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int m = scan.nextInt();
        int[][] edges = new int[m][3];

        for(int i=0;i<m;i++){
            edges[i][0] = scan.nextInt();
            edges[i][1] = scan.nextInt();
        }

        int[][] graph = matrixInput(n,edges);
        ArrayList<int[]>[] graph2 = arrayInput(n,edges);
        ArrayList<ArrayList<int[]>> graph3 = arrayListInput(n,edges);
        Map<Integer, ArrayList<int[]>> graph4 = mapInput(n,edges);
        ArrayList<ArrayList<Integer>>[] graph5 = arrayArrayListInput(n,edges);
        ArrayList<ArrayList<ArrayList<Integer>>> graph6 = arrayListArrayListInput(n,edges);
        Map<Integer, ArrayList<ArrayList<Integer>>> graph7 = mapArrayListInput(n,edges);
    }

    private static int[][] matrixInput(int n,int[][] edges){
        int[][] graph = new int[n][n];
        for(int[] row:graph){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        for(int[] edge: edges){
            graph[edge[0]][edge[1]] = edge[2];
            graph[edge[1]][edge[0]] = edge[2];
        }

        return graph;
    }


    private static ArrayList<int[]>[] arrayInput(int n,int[][] edges){
        @SuppressWarnings({"unchecked"})
        ArrayList<int[]>[] graph = new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] edge: edges){
            graph[edge[0]].add(new int[]{edge[1],edge[2]});
            graph[edge[1]].add(new int[]{edge[0],edge[2]});
        }

        return graph;
    }

    private static ArrayList<ArrayList<int[]>> arrayListInput(int n,int[][] edges){
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            graph.get(edge[0]).add(new int[]{edge[1],edge[2]});
            graph.get(edge[1]).add(new int[]{edge[0],edge[2]});
        }

        return graph;
    }
    private static Map<Integer, ArrayList<int[]>> mapInput(int n,int[][] edges) {
        Map<Integer, ArrayList<int[]>> graph = new HashMap<>();

        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], k -> new ArrayList<>());
            graph.get(edge[0]).add(new int[]{edge[1],edge[2]});

            graph.computeIfAbsent(edge[1], k -> new ArrayList<>());
            graph.get(edge[1]).add(new int[]{edge[0],edge[2]});
        }

        return graph;
    }

    private static ArrayList<ArrayList<Integer>>[] arrayArrayListInput(int n,int[][] edges){
        @SuppressWarnings({"unchecked"})
        ArrayList<ArrayList<Integer>>[] graph = new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] edge: edges){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(edge[1]);
            list.add(edge[2]);
            graph[edge[0]].add(list);
            list = new ArrayList<>();
            list.add(edge[0]);
            list.add(edge[2]);
            graph[edge[1]].add(list);
        }

        return graph;
    }

    private static ArrayList<ArrayList<ArrayList<Integer>>> arrayListArrayListInput(int n,int[][] edges){
        ArrayList<ArrayList<ArrayList<Integer>>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(edge[1]);
            list.add(edge[2]);
            graph.get(edge[0]).add(list);
            list = new ArrayList<>();
            list.add(edge[0]);
            list.add(edge[2]);
            graph.get(edge[1]).add(list);
        }

        return graph;
    }
    private static Map<Integer, ArrayList<ArrayList<Integer>>> mapArrayListInput(int n,int[][] edges) {
        Map<Integer, ArrayList<ArrayList<Integer>>> graph = new HashMap<>();

        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], k -> new ArrayList<>());
            ArrayList<Integer> list = new ArrayList<>();
            list.add(edge[1]);
            list.add(edge[2]);
            graph.get(edge[0]).add(list);

            graph.computeIfAbsent(edge[1], k -> new ArrayList<>());
            list = new ArrayList<>();
            list.add(edge[0]);
            list.add(edge[2]);
            graph.get(edge[1]).add(list);
        }

        return graph;
    }

}
