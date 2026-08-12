public class BinarySearch {

    public static void main(String[] args){

        int[] arr = {9,23,34,45,56,76,89,98,105,203};
        int target = 45;

        int result = binarySearch(arr,target);
        System.out.println(result);
        
    }

    static int binarySearch(int[] n, int target){

        if(n.length == 0){
            return -1;
        }
        int start = 0;
        int end = n.length-1;

        while(start<=end){
        int mid = start+(end-start)/2;

        if(target>n[mid]){
            start = mid+1;
        }
        else if(target <n[mid]){
            end = mid-1;
        }
        else {
            return mid;
        }
    }
        return -1;

    }
    
    
}
