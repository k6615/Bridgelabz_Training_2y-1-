package Arrays.Leetcode;

import java.util.Scanner;

public class Leetcode_2176 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,1,2,2,2,1,3};
        System.out.print("enter value of k: ");
        int k = sc.nextInt();
        int count =0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j] && (i*j)%k ==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
