package Arrays.Leetcode;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 9, 6};
        System.out.println("max element:"+max(arr));
    }
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
