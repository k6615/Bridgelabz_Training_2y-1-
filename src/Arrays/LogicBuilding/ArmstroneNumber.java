package Arrays.LogicBuilding;

public class ArmstroneNumber {
    public static void main(String[] args){
        int n =153;
        System.out.println(isArmstrong(n));
    }
    public static int count(int n){
        int counts = 0;
        while(n>0){
            counts++;
            n = n/10;
        }
        return counts;
    }
    public static boolean isArmstrong(int n){
        int original = n;
        int d = count(n);
        int sum = 0;
        while (n>0){
            int rem = n%10;
            sum = (int)(sum + Math.pow(rem,d));
            n = n/10;
        }
        if(sum == original) return true;
        else return false;
    }
}
