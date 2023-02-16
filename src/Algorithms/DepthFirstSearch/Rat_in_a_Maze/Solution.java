package Algorithms.DepthFirstSearch.Rat_in_a_Maze;

import java.util.ArrayList;

class Solution {
    public ArrayList<String> findPath(int[][] arr, int n) {
        ArrayList<String> list = new ArrayList<>();
        backtrack(list,arr,0,0,"",n);
        return list;
    }

    private void backtrack(ArrayList<String> list,int[][] arr,int i,int j,String path,int n){
        if(i==n-1 && j==n-1 && arr[i][j]==1){
            list.add(path);
            return;
        }
        if(i==-1 || j==-1 || i==n || j==n || arr[i][j]==0){
            return;
        }
        arr[i][j]=0;
        backtrack(list,arr,i+1,j,path+'D',n);
        backtrack(list,arr,i,j-1,path+'L',n);
        backtrack(list,arr,i,j+1,path+'R',n);
        backtrack(list,arr,i-1,j,path+'U',n);
        arr[i][j]=1;
    }
}