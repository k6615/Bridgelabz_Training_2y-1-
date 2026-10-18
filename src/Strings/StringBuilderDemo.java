package Strings;

public class StringBuilderDemo {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("karan");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.insert(5,'x');
        System.out.println(sb);

        System.out.println(sb.reverse());

        sb.delete(3,4);
        System.out.println(sb);

        
    }
}
