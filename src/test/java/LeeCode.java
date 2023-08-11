import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : lzp
 * @date : 2023/8/2 10:10
 * @apiNote : TODO
 */
public class LeeCode {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {
                new int[]{1, 2, 3, 4},
                new int[]{5, 0, 7, 8},
                new int[]{9, 10, 11, 12},
                new int[]{13, 14, 15, 0}
        };
        solution.setZeroes(matrix);
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf(anInt + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]==0) {
                    row[i]=true;
                    column[j]=true;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (row[i]||column[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
