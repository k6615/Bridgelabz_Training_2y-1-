package Arrays.LogicBuilding;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println(isPrime(n));

    }
    public static boolean isPrime(int n){
        int count = 0;
        if(n==2) return true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count > 0) return false;
        else return true;

    }
}
