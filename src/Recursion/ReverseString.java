package Recursion;

public class ReverseString {
    public static void print(String s,int i){
        if(i == s.length()){
            return;
        }
        print(s,i+1);
        System.out.print(s.charAt(i));
    }
    public static void main(String[] args){
        String s = "karan";
        print(s,0);

    }
}
