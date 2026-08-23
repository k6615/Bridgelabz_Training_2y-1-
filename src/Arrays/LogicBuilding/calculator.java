package Arrays.LogicBuilding;

public class calculator {
    public static void main(String[] args){
        int a=10,b=2;
        System.out.println("addition :"+sum(a,b));
        System.out.println("substraction :"+sub(a,b));
        System.out.println("multiplication :"+mul(a,b));

    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
}
