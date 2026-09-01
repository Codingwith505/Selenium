public class OrderAgnosticBS {

    public static void main(String[] args) {


        int[] arr = {90,67,56,36,26,12,2};
        // int [] arr = {};
        int target =12;
        int result = orderAgnosticBinarySearch(arr,target);
        System.out.println(result);
        
    }
    
    static int orderAgnosticBinarySearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        boolean isAcsOrder = arr[start]<arr[end];
            
        while(start<=end){
            int mid = start+(end-start);

            if(target==arr[mid])
            {
                return mid;
            }
            else if(isAcsOrder){
               if(target<arr[mid]){
                end= mid-1;
               }
               else{
                start= mid+1;
               }

            }
            else{
                if(target>arr[mid]){
                    end= mid-1;
                }
                else{
                start= mid+1;
               }

            }
        }
        return -1;
            
        }
    }

