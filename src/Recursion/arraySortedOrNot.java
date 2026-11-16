package Recursion;

public class arraySortedOrNot {
    public static void main(String[] args){
        int[] arr = {3,7,4,7,6};

    }
    public static boolean isSorted(int[] arr,int i){
        if(i == arr.length){
            return true;
        }
        if(arr[i] > arr[i-1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
}
