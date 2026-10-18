package PACKAGE_NAME.Arrays;

public class Basics {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        swap(0,5,arr);

    }
    public static void swap(int a,int b,int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        print(arr);
    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
