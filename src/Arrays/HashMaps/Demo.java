package Arrays.HashMaps;

import java.util.HashMap;

public class Demo {
   public static void main(String[] args){
       HashMap<Integer,String> map = new HashMap<>();
       map.put(18,"VK");
       map.put(10,"ST");
       map.put(45,"RS");
       map.put(7,"MSD");
       System.out.println(map);

       System.out.println(map.get(10));
       map.put(19,"karan");
       System.out.println(map);

       boolean n = map.containsKey(19);
       System.out.println(n);
       boolean m = map.containsValue("karan");
       System.out.println(m);
       map.remove(19,"karan");
       System.out.println(map);


   }
}
