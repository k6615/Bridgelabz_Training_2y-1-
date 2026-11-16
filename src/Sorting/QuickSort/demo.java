package Sorting.QuickSort;

public class demo {
    public static void main(String[] args){
        int[] arr = {2,5,9,7,5,3,7};
        quickSort(arr,0,arr.length-1);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void quickSort(int[] arr,int s,int e) {
        if (s >= e) {
            return;
        }
        int pivotIndex = partition(arr,s,e);
        quickSort(arr,s,pivotIndex-1);
        quickSort(arr,pivotIndex+1,e);
    }
    public static int partition(int[] arr,int s,int e){
        int pivot = arr[s];
        int count=0;
        for(int i=s+1;i<=e;i++){
            if(arr[i] <= pivot){
                count++;
            }
        }
        int currentPosition = s+count;
        int temp = arr[currentPosition];
        arr[currentPosition] = arr[s];
        arr[s] = temp;

        int i=s,j=e;
        while(i < currentPosition && j > currentPosition){
            while(arr[i] <= pivot){
                i++;
            }
            while(arr[j] > pivot){
                j--;
            }
            if(i < currentPosition && j > currentPosition){
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
                i++;
                j--;
            }
        }
        return currentPosition;
    }
}
