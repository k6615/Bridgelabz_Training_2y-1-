package Recursion;

public class maxInArray {
    public static int max(int[] arr,int i){
        if(i == arr.length-1){
            return arr[i];
        }
        int ans = max(arr,i+1);
        return Math.max(ans,arr[i]);
    }
    public static void main(String[] args){
        int[] arr = {1,9,2,5,7};
        System.out.println(max(arr,0));
    }
}
