package Algorithms.Matrix.SpiralMatrix;

public class SpiralMatrix {

    public int[][] spiralMatrix(int m,int n) {
        int[][] matrix = new int[m][n];
        int k = 1;
        int i = 0, j = 0;
        while (k <= m * n) {
            // left to right
            while (j < n && matrix[i][j] == 0) {
                matrix[i][j] = k++;
                j++;
            }
            j--;
            i++;
            // top to bottom
            while (i < m && matrix[i][j] == 0) {
                matrix[i][j] = k++;
                i++;
            }

            // right to left
            i--;
            j--;
            while (j >= 0 && matrix[i][j] == 0) {
                matrix[i][j] = k++;
                j--;
            }

            // bottom to top
            i--;
            j++;
            while (i >= 0 && matrix[i][j] == 0) {
                matrix[i][j] = k++;
                i--;
            }
            i++;
            j++;
        }
        return matrix;
    }
}
