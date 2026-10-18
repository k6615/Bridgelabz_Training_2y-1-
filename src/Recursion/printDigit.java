package Recursion;

public class printDigit {
    public static void print(int n){
        if(n==0){
            return;
        }
        int digit = n%10;
        n = n/10;
        print(n);
        System.out.println(digit);
    }
    public static void main(String[] args){
        int n = 126;
        print(n);
    }
}
