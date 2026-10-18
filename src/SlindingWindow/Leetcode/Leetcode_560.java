package SlindingWindow.Leetcode;

import java.util.Scanner;

public class Leetcode_560 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("enter the value of k : ");
        int k = sc.nextInt();
        System.out.println("enter the Array : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += arr[i];
                if(sum==k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
