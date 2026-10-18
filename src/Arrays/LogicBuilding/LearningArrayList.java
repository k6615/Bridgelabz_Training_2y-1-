package PACKAGE_NAME.Arrays.LogicBuilding;
import java.util.ArrayList;
import java.util.Arrays;

public class LearningArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,2);
        list.add(1,4);
        list.add(2,6);

        System.out.println(list.get(2));

        System.out.println(list);
        list.add(2,10);
        System.out.println(list);



        System.out.println("we have convert AraayList into Array");
        int[] arr = new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
