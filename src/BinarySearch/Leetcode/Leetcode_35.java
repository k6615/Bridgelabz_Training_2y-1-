package BinarySearch.Leetcode;

import java.util.Scanner;

public class Leetcode_35 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        System.out.println("enter the array element:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target value :");
        int target = sc.nextInt();
        int start =0;
        int end  = n-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                System.out.println(mid);
            }
            else if(arr[mid] < target){
                start = end+1;
            }
            else{
                end = mid-1;
            }
        }
        System.out.println(start);
    }
}
