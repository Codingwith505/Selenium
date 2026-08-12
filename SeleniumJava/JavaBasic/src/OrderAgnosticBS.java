public class OrderAgnosticBS {

    public static void main(String[] args) {


        // int[] arr = {0,23,34,56,78,90,102,120,134};
        int [] arr = {};
        int target =90;
        int result = orderAgnosticBinarySearch(arr,target);
        System.out.println(result);
        
    }
    
    static int orderAgnosticBinarySearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        boolean isAcsOrder = arr[start]<arr[end]/2;
            
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

