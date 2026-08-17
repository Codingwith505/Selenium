public class FindFirstAndLastNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,4,4,5,5,7,7,};
        int target = 5;
        searchFirstandLastNumber(arr,target);
        

    }

    static int searchFirstandLastNumber(int[] arr, int target){

        
        int s = 0;
        int e = arr.length-1;
        

        while(s<=e){
            int mid = s+(e-s)/2;

            if(target<arr[mid]){
                e=mid-1;
           
            }
            else if(target>arr[mid]){
                s = mid+1;
                
            }
            else{
                return mid;
            }
            
            
        }
        
        return -1;
    }
    
}
