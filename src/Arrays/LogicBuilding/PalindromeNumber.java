package Arrays.LogicBuilding;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
    public static  boolean isPalindrome(int n){
        int original = n;
        int reverse = 0;
        while(n>0){
            int lastdigit  = n%10;
            reverse = reverse*10 + lastdigit;
            n = n/10;
        }
        if(reverse==original) return true;
        else return false;
    }
}
