package Recursion;

public class frequency {

    public static void freq(String s,int i,char ch,int count){
        if(i == s.length()){
            System.out.println(count);
            return;
        }
        if(s.charAt(i) == ch){
            count++;
        }
        freq(s,i+1,ch,count);
    }
    public static void main(String[] args){
        String s = "karan";
        int count=0;
        freq(s,0,'r',count);
    }
}
