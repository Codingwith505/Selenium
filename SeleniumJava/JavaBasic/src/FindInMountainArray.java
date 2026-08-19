public class FindInMountainArray {

    public static void main(String[] args) {
        int[] arr = {0,1,3,5,7,9,7,5,4,1};
        int target = 1;

        // return the minimum index
        System.out.println(minIndexMoutainTargetNumber(arr,target));
    }


    static int minIndexMoutainTargetNumber(int[] arr, int target){

        int peak = findPeakValue(arr);
        int firstTry= orderAgnosticSearch(arr,target,0,peak);
        if(firstTry!= -1){
            return firstTry;
        }
        else{
            return orderAgnosticSearch(arr, target, peak, arr.length-1);
        }

    }

    static int findPeakValue(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }

        }
        return start;
    }




    static int orderAgnosticSearch(int[] arr, int target, int start, int end){

        boolean isAscending = arr[start]<=arr[end];
        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(isAscending){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end = mid-1;
                }

            }

        }
        return -1;
    }
    
}
