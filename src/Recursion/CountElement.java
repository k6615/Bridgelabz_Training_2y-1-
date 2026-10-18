package Recursion;

public class CountElement {
    public static void find(int[] arr,int i,int target,int count){
        if(i >= arr.length){
            System.out.println(count);
            return;
        }
        if(arr[i] == target){
            count++;
        }
        find(arr,i+1,target,count);
    }
    public static void main(String[] args){
        int[] arr = {10,20,10,10,30,10,10};
        int count =0,target = 10;
        find(arr,0,target,count);

    }
}
