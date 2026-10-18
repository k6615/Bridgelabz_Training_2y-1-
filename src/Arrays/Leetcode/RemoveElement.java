package PACKAGE_NAME.Arrays.Leetcode;

public class RemoveElement {
    public static void main(String[] args){
        int[] arr = {0,1,2,2,3,0,4,2};
        remove(arr,2);
        for(int ele:arr){
            System.out.println(ele);
        }
    }
    public static void remove(int[] arr,int val){
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!= val){
                arr[j] =arr[i];
                j++;
            }
        }
    }
}
