package Arrays.HashMaps;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 5, 2, 2, 1, 3, 2, 1, 4, 3, 1, 2, 4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);

    }
}
