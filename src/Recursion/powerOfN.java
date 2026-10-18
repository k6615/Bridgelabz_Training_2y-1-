package Recursion;

public class powerOfN {
    public static int power(int p,int q){
        if(q==0) return 1;
        int ans = p * power(p,(q-1));
        return ans;
    }
    public static void main(String[] args){
        System.out.println(power(5,4));
    }
}
