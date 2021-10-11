package Classes;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Input = ");
        for (int[] ints : matrix) {
            for (int intinner:ints){
                System.out.print(intinner+",");
            }
            System.out.println();
        }
        List<Integer> res =spiralOrder(matrix);
        System.out.println("Output = ");
            for (int intinner:res){
                System.out.print(intinner+",");
        }
            System.out.println();
        int[][] matrix1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println("Input = ");
        for (int[] ints : matrix1) {
            for (int intinner:ints){
                System.out.print(intinner+",");
            }
            System.out.println();
        }
        List<Integer> res1 =spiralOrder(matrix1);
        System.out.println("Output = ");
        for (int intinner : res1){
            System.out.print(intinner+",");
        }
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>result = new ArrayList<>();

        if(matrix==null ||matrix.length==0||matrix[0].length==0)return result;
        int m= matrix.length;
        int n= matrix[0].length;
        int left=0;
        int right=n-1;
        int top = 0;
        int bottom=m-1;
        while(result.size()<m*n){
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(bottom<top)break;
            for(int i=right;i>=left;i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;

            if(right<left)break;
            for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            left++;

        }
        return result;
    }
}
