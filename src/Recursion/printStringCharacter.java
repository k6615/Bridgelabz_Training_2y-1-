package Recursion;

public class printStringCharacter {
    public static void print(String s,int i){
        if(i == s.length()){
            return;
        }
        System.out.print(s.charAt(i));
        print(s,i+1);
        System.out.print(s.charAt(i));
    }
    public static void main(String[] args){
        String s = "hello";
        print(s,0);
    }
}
