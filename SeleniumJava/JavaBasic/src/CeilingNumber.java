public class CeilingNumber {

    public static void main (String[] args){

        int[] arr = {2,4,9,11,14,19};
        int target = 15;

        int result = findBSQuestion(arr,target);
        System.out.println(result);

    }
    static int findBSQuestion(int[] arr, int target){
        
        int s = 0;
        int e = arr.length-1;
        if(e==0){
            return -1;
        }
        boolean isOrder = arr[s]<arr[e];

        while(s<=e){
            int mid = s+(e-s)/2;

            if(target == arr[mid]){
                return mid;
            }
            else if(isOrder){
                if (target<arr[mid]) {
                    e = mid-1;
                    
                }
                else{
                    s = mid+1;
                }

            }
            else {
                if (target>arr[mid]) {
                    e = mid-1;
                    
                }
                else{
                    s = mid+1;
                }

            }
             
        }
        return s;
         
        
    }
    
}

