
public class MissingNumber {

    public static void main (String[] args){
        int[] arr = {1,4,0,2};
        int result = missingNumber(arr);
        System.out.println(result);
    }


    static int missingNumber(int[] arr){
        cyclicSort(arr);

        for(int index = 0; index<arr.length; index++){
            if(index !=arr[index] ){
                return index; // After sorting the array then we can find the missing number where we match all index with that number 
            }
        }
        return arr.length;  // In that case where array is already sort and the last index is missing number e.g., [0,1,2] so, in this case return last index 


    }

    static void cyclicSort(int[] arr){
        
        int i = 0;

        while(i<arr.length){
            int correct = arr[i];

            if( arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        
    }

    static void swap (int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
    
}
