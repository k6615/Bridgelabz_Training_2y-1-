package SlindingWindow.Leetcode;

import java.util.Scanner;

public class Leetcode_209 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        System.out.println("enter array element");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("fix target :");
        int target = sc.nextInt();

        int sum =0;
        int start =0;
        int min = Integer.MAX_VALUE;
        for(int end =0;end<arr.length;end++){
            sum += arr[end];
            while(sum>=target){
                min = Math.min(min,end-start+1);
                sum = sum-arr[start];
                start++;
            }
        }
        if(min == Integer.MAX_VALUE){
            System.out.println(0);
        }
        else {
            System.out.println(min);
        }
    }
}
