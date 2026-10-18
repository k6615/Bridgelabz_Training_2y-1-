package SlindingWindow;

public class Syntext {
    public static void main(String[] args){
        int sum =0;
        int maxSum =0;
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int size = 3;
        for(int i=0;i<size;i++){
            sum += arr[i];
        }
        System.out.println(sum);
        for(int i=1;i<=n-size;i++){
            sum = sum - arr[i-1] + arr[i+size-1];
            System.out.println(sum);
            maxSum =  Math.max(maxSum,sum);
        }
        System.out.println("max sum is: "+maxSum);
    }
}
