import java.util.ArrayList;
import java.util.List;

/**
 * @author : lzp
 * @date : 2023/8/2 10:10
 * @apiNote : TODO
 */
public class LeeCode {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] merge = solution.merge(new int[][]{new int[]{1, 3}, new int[]{2, 6}, new int[]{8, 10}, new int[]{15, 18}});
        for (int[] ints : merge) {
            for (int anInt : ints) {
                System.out.printf(anInt + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> targetList = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int[] one = intervals[i];
            int mix = one[0];
            int max = one[1];
            if (max==0&&mix==0){
                continue;
            }
            for (int j = i + 1; j < intervals.length; j++) {
                int[] two = intervals[j];
                boolean flag=false;
                if (one[1] >= two[0] && (one[1] < two[1])) {
                    max=two[1];
                    flag=true;
                }
              if (two[1] >= one[0] && (two[1] < one[1])) {
                    mix=one[1];
                    flag=true;
                }
                if (flag) {
                    two[0]=0;
                    two[1]=0;
                }
            }
            int[] tar=new int[]{mix,max};
            targetList.add(tar);
        }
        int[][] tarArray=new int[targetList.size()][2];
        for (int i = 0; i < targetList.size(); i++) {
            tarArray[i]=targetList.get(i);
        }
        return tarArray;
    }
}
