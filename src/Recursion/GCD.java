package Recursion;

public class GCD {
    public static int GCD(int x,int y){
        if(y==0) return x;
        int ans = GCD(y,x%y);
        return ans;
    }
    public static int lcm(int x,int y){
        return (x/GCD(x,y))*y;
    }
    public static void main(String[] args){
        System.out.println(GCD(12,18));
        System.out.println(lcm(12,18));
    }
}
