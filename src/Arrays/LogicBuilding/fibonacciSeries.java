package PACKAGE_NAME.Arrays.LogicBuilding;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        int a =1,b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a);
            int c = a+b;
            a = b;
            b = c;
        }


    }
}
