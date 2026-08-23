package Arrays.Leetcode;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4,4};
        System.out.println(remove(arr));

    }
    public static int remove(int[] arr){
        int j=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i] != arr[i-1]){
                arr[j] = arr[i];
                j++;
            }
        }
        return j+1;
    }
}
