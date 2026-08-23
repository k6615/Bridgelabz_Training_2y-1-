package Arrays.Leetcode;
import java.util.Arrays;

public class Leetcode_977 {
    public static void main(String[] args){
        int[] arr = {-4,-1,0,3,10};
        int[] result = sortedSquares(arr);
        for(int ele : result){
            System.out.println(ele);
        }
    }
    public static int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                nums[i] = nums[i]*nums[i];
            }
            Arrays.sort(nums);
            return nums;
        }
        return nums;
    }
}
