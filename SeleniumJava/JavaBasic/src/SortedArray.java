import java.util.Arrays;

public class SortedArray {

    public static void main(String[] args){
        int[] arr = {9,23,34,87,56,98,69,-1,0,89,78,54,2,45,78,90,-67,89,-56,-67,34,-23,-12,-4,-5};
        swapArray(arr);

    }
    static void swapArray(int[] arr){
        
       for(int i = 0; i<arr.length;i++){
       int smallest = findSmallest(arr,i);
       int temp = arr[i];
       arr[i] = arr[smallest];
       arr[smallest] = temp;
            
        }
        System.out.println(Arrays.toString(arr));
    }

    static int findSmallest(int[] arr, int i){
        if(arr.length==0){
            return -1;
        }
       int smallestValue = arr[i];
       int smallestIndex = i;

       for(int j = i+1; j<arr.length;j++){
            if(arr[j]<smallestValue){
                smallestValue = arr[j];
                smallestIndex = j;
            }

            

       }
       return smallestIndex;
        
    }
    
}
