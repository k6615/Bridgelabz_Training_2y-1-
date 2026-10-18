package Sorting.BubbleSort;

public class demo {
    public static void main(String[] args){
        int num[] = {3,2,1,4,5};
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length-1-i;j++){
                if(num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        for(int i:num){
            System.out.print(i+" ");
        }
    }
}
