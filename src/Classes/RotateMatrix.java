package Classes;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Input = ");
        for (int[] ints : matrix) {
            for (int intinner:ints){
                System.out.print(intinner+",");
            }
            System.out.println();
        }
        rotate(matrix);
        System.out.println("Output = ");
        for (int[] ints : matrix) {
            for (int intinner:ints){
                System.out.print(intinner+",");
            }
            System.out.println();
        }
        int[][] matrix1 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        System.out.println("Input = ");
        for (int[] ints : matrix1) {
            for (int intinner:ints){
                System.out.print(intinner+",");
            }
            System.out.println();
        }
        rotate(matrix1);
        System.out.println("Output = ");
        for (int[] ints : matrix1) {
            for (int intinner:ints){
                System.out.print(intinner+",");
            }
            System.out.println();
        }
  int[][] matrix2 = {{1}};
        System.out.println("Input = ");
        for (int[] ints : matrix2) {
            for (int intinner:ints){
                System.out.print(intinner+",");
            }
            System.out.println();
        }
        rotate(matrix2);
        System.out.println("Output = ");
        for (int[] ints : matrix2) {
            for (int intinner:ints){
                System.out.print(intinner+",");
            }
            System.out.println();
        }
  int[][] matrix3 = {{1,2},{3,4}};
        System.out.println("Input = ");
        for (int[] ints : matrix3) {
            for (int intinner:ints){
                System.out.print(intinner+",");
            }
            System.out.println();
        }
        rotate(matrix3);
        System.out.println("Output = ");
        for (int[] ints : matrix3) {
            for (int intinner:ints){
                System.out.print(intinner+",");
            }
            System.out.println();
        }

    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < Math.ceil(((double) n) / 2.); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp;
            }
        }
    }
}
