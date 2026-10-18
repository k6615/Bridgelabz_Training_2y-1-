package Arrays.Leetcode;

import java.util.Scanner;

public class Leetcode_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int maxVal = 0;
        int start =0;
        int end = arr.length-1;

        while(start < end){
            if(arr[start] <arr[end]){
                maxVal = Math.max(maxVal,arr[start]*(end-start));
                start++;
            }
            else{
                maxVal = Math.max(maxVal,arr[end]*(end-start));
                end--;
            }
        }
        System.out.println(maxVal);
    }

}
