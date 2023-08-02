/**
 * @author : lzp
 * @date : 2023/8/2 10:10
 * @apiNote : TODO
 */
public class LeeCode {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.searchInsert(new int[]{1, 3, 5,6}, 2);
        System.out.println(i);
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = nums.length / 2; i < nums.length; ) {
            int lastIndex = i;
            if (target < nums[i]) {
                i /= 2;
            } else {
                i = i + i / 2;
            }
            if (Math.abs(i - lastIndex) == 0) {
                if (nums[i] == target) {
                    return i;
                } else {
                    if (target > nums[i]) {
                        //如果右边还有比target小的,下标往右移,直到数组末尾或者遇到比target大的
                        while (i <= nums.length - 1) {
                            if (nums[i] >= target) {
                                if (i>nums.length-1){

                                }
                                return i;
                            }
                            i++;
                        }
                        return i;
                    } else {
                        while (i > 0) {
                            if (nums[i] >= target) {
                                return i;
                            }
                            i--;
                        }
                        return i;
                    }
                }
            }
        }
        return nums.length;
    }
}