import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {3,6,8,2,1,0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int last = arr.length-i-1;
            int maxIndex = findMaxIndex(arr,i);
            swapped(arr,maxIndex, last);
            
        }

    }

    static int findMaxIndex(int[] arr,int i){
        int max = 0;
        for(int j = 1; j<arr.length-i;j++){
            if(arr[max]<arr[j]){
                max = j;

            }
        }
        return max;

    }

    static void swapped(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
