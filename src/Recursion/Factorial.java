package Recursion;

public class Factorial {
    public static int fac(int n){
        if(n == 0){
            return 1;
        }
        int ans = n*fac(n-1);
        return ans;
    }
    public static void main(String[] args){
        System.out.println(fac(5));
    }
}
