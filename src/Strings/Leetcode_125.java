package Strings;

import java.util.Scanner;

public class Leetcode_125 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "A man, a plan, a canal: Panama";
        int i =0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println(s+" is not a palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println(s+" is a palindrome");
    }
}
