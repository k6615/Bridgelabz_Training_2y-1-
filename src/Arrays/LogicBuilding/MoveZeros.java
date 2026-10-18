package Arrays.LogicBuilding;

import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j] = arr[i];
                j++;
            }
        }
        for(int i=j;i<arr.length;i++){
            arr[j] = 0;
        }

        for(int element : arr){
            System.out.print(element);
        }
    }
}
