package Arrays.Leetcode;

import java.util.Scanner;

public class Leetcode_283 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {0,1,0,3,12};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j] = arr[i];
                j++;
            }
        }
        for(int i=j;i<arr.length;i++){
            arr[i] = 0;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
