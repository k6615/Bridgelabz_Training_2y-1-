package Recursion;

public class intOfArray {
     public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        print(arr,0);

    }
    public static void print(int[] arr,int i){
        if(i == arr.length){
            return;
        }
        System.out.print(arr[i]+" ");
        print(arr,i+1);

    }
}
