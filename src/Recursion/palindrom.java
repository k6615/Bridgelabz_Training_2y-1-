package Recursion;

public class palindrom {
    public static boolean palindrom(String s,int start,int end){
        if(start >= end){
            return true;
        }
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        return palindrom(s,start+1,end-1);
    }
    public static void main(String[] args){
        String s = "karan";
        System.out.println(palindrom(s,0,s.length()-1));
    }
}
