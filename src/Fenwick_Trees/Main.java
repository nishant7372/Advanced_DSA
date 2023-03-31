package Fenwick_Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scan.nextInt();

        System.out.println("Enter Elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        Fenwick_Tree fenwickTree = new Fenwick_Tree(arr);

    }
}
