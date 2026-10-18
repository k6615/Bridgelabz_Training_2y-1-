package Arrays.Leetcode;

import java.util.Scanner;

public class Leetcode_3065 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int n = sc.nextInt();
        System.out.println("enter array element: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the k: ");
        int k = sc.nextInt();
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i] < k){
                count++;
            }
        }
        System.out.println(count);


    }
}
