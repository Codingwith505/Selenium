import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumber {

    public static void main (String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> result =  findDisappearedNumber(arr);
       System.out.print(result);
        
    }


    static List<Integer> findDisappearedNumber(int[] arr){
        cyclicSort(arr);
        List<Integer>  missing = new ArrayList<>(); 
        for(int index = 0; index<arr.length; index++){
            if(arr[index] != index+1){
                missing.add(index+1);
            }

        }
        return missing;
        
    }



    static void cyclicSort(int[] arr){
        int i = 0;

        while(i<arr.length){
            int correct = arr[i]-1;

            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]){
                swap(arr, i, correct);

            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
    
}
