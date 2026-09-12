import java.util.Arrays;

public class CylicSort {

    public static void main (String[] args){

        int[] arr = {1,2,3,6,4,8,7,5};
        cylicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cylicSort(int[] arr){

        int i = 0;
        while (i<arr.length-1) { 
            
            int correct = arr[i]-1;

            if(arr[i]!= arr[correct]){
                swapped(arr, i,correct);
            }
            else{
                i++;
            }
        }

    }

    static void swapped(int[] arr, int start, int second){
        int temp = arr[start];
        arr[start] = arr[second];
        arr[second] = temp;
    }
    
}
