package Arrays.HashMaps;

import java.util.HashMap;

public class frecquency {
    public static void main(String[] args){
        int[] nums = {1,1,2,2,3,3,4,5,2,5,3,5};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:map.values()){
            System.out.print(i+"  ");
        }
    }
}
