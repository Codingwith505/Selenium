public class FindRotatedNumber {

    public static void main(String[] args) {

        int[] arr = {9,0,2,3,5,7};

        System.out.println(numberOfRotation(arr));
  
    }

    static int numberOfRotation(int[] arr){
        int peak = findPivot(arr);
        return peak+1;
    }

    //Find largest number in the sorted array

    static int findPivot(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while (start<end) { 
            int mid = start+(end-start)/2;

            // case 1 if mid is greater than next to mid then return pivot 

            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            else if (arr[start]<arr[mid]){
                start = mid+1;
            }
            else {
                end = mid;
            }
  
        }
        return -1;

        
    }
    
}
