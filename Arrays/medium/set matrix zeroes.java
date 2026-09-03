//leetcode: 73 (Set Matrix Zeroes):
import java.util.*;
class Main {
    public static void setzeros(int[][] matrix){
        // col = matrix[0][...]
        // row = matrix[...][0]
        int n = matrix.length; // no of rows
        int m = matrix[0].length; // no of numbers in the coloumn
        int col0 = 1;
        
        //identifing zeroes:
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j == 0){
                        col0 = 0;
                    }
                    else{
                        matrix[0][j] = 0;
                    }
                }
            }
        }
        
        // marking zeros:
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j] != 0){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        //edge cases:
        if(matrix[0][0] == 0){
            for(int j=0;j<m;j++){
                matrix[0][j] = 0;
            }
        }
        if(col0 == 0){
            for(int i=0;i<n;i++){
                matrix[i][0] = 0;
            }
        }
    }
    public static void main(String[] args){
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setzeros(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}

