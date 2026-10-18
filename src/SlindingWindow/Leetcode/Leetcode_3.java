package SlindingWindow.Leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class Leetcode_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Character> l1 = new ArrayList<>();
        int max=0;
        int start=0,end=0;
        while(end<s.length()){
            if(!l1.contains(s.charAt(end))){
                l1.add(s.charAt(end));
                end++;
                max = Math.max(max,l1.size());
            }
            else{
                l1.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        System.out.println(max);
    }
}
