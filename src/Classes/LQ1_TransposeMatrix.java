package Classes;

public class LQ1_TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr1  = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        LQ1_TransposeMatrix transposeMatrix = new LQ1_TransposeMatrix();
        int[][] res = transposeMatrix.transpose(arr1);
        for(int i=0;i<res.length;i++){
            for(int j=0;j< res[0].length;j++){
                System.out.print(res[i][j]+",");
            }
            System.out.println();
        }

    }
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int [][]res = new int [col][row] ;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                res[i][j]=matrix[j][i];
            }
        }
        return res;
    }
}
