package Recursion;

public class BinarySearch {
    public static int solve(int[] arr,int target,int start,int end){
        if(start >= end){
            return -1;
        }
        int mid = start+(end - start)/2;
        if(arr[mid] == target){
            return mid;
        } else if (arr[mid] < target) {
            start = mid+1;
        } else {
            end = mid - 1;
        }
        return solve(arr,target,start,end);

    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int target = 80;
        int start = 0;
        int end = arr.length-1;
        System.out.println(solve(arr,target,start,end));
    }
}
