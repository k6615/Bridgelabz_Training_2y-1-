package Recursion;

public class CountTheVowels {
    public static void count(String s,int i,int count){
        if(i == s.length()){
            System.out.println(count);
            return;
        }
        if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
            count++;
        }
        count(s,i+1,count);
    }

    public static void main(String[] args){
        String s = "karan";
        count(s,0,0);

    }
}
