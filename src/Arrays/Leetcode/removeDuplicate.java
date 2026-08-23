package Arrays.Leetcode;

import java.util.Scanner;

public class removeDuplicate {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the array length:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        RemoveDupli(arr);
    }
    public static void RemoveDupli(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
