package Recursion;

public class search{
    public static int search(int[]arr ,int index,int target){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return search(arr,index+1,target);
    }
    public static void main(String[] args){
        int[] arr = {1,5,6,3,5,6,2};
        System.out.println(search(arr,0,5));
    }
}
