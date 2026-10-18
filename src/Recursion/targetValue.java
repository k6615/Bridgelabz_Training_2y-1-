package Recursion;

public class targetValue {
    public static int find(int[] arr,int i,int target){
        if(i >= arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return find(arr,i+1,target);
    }
    public static void main(String[] args){
        int[] arr ={10,20,30,50,90};
        int target = 50;
        System.out.println(find(arr,0,target));
    }
}
