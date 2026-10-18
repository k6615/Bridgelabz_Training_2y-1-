package Arrays.Leetcode;

import java.util.Scanner;

public class Leetcode_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 7, 11, 15};
        int k = 9;
        int target = 9;
        int[] nums = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    nums[0] = i;
                    nums[1] = j;
                    break;
                }
            }
        }
        for(int ele:nums){
            System.out.print(ele+" ");
        }

    }

}
