package SlindingWindow.Leetcode;

import java.util.Scanner;

public class Leetcode_1876 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();
        int k = 3;

        int count=0;
        for(int i=0;i< str.length()-k;i++){
            if(str.charAt(i)!=str.charAt(i+1) && str.charAt(i+1)!=str.charAt(i+2) && str.charAt(i+2)!=str.charAt(i)){
                count++;
            }
        }
        System.out.println(count);

    }
}
