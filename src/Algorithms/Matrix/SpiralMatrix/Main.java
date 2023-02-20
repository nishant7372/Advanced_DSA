package Algorithms.Matrix.SpiralMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        System.out.println("Enter the dimensions of matrix:");
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = spiralMatrix.spiralMatrix(m,n);

        for(int[] x:a)
            System.out.println(Arrays.toString(x));
    }
}
