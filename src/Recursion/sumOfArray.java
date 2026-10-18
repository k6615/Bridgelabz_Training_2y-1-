package Recursion;

public class sumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sum(0,arr));
    }
    public static int sum(int i,int[] arr){
        if(i == arr.length){
            return 0;
        }
        int ans = arr[i] + sum(i+1,arr);
        return ans;

    }
}
