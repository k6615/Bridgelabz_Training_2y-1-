package Recursion;

public class printName {
    public static void print(int n){
        if(n==0) {
            return;
        }
        System.out.println("karan");
        print(n-1);
    }
    public static void main(String[] args){
        print(10);
    }
}
