package SlindingWindow.Leetcode;

import java.util.Scanner;

public class Leetcode_643 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the value of k:");
        int k = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        maxSum = sum;
        for (int i = 1; i <= arr.length - k; i++) {
            sum = sum - arr[i - 1] + arr[i+k-1];
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println("max avg : " + (double)maxSum/k);
    }
}
