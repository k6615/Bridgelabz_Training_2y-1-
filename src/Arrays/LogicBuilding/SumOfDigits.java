package Arrays.LogicBuilding;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("sum of digits :"+sumDigit(n));
    }
    public static int sumDigit(int n){
        int sum = 0;
        int r=0;
        while (n>0){
            r = n%10;
            sum += r;
            n = n/10;
        }
        return sum;
    }
}
