

public class FloorNumber {
    public static void main (String[] args){
        int[] arr = {12,23,34,45,56,67,78,89,90};
        int target = 10;
        System.out.println(floorNumber(arr,target));

    }

    static int floorNumber(int[] arr, int target){
        int s = 0;
        int e = arr.length;

        if(e==0){
            return -1;
        }

        boolean isAcs = s<e;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(target==arr[mid]){
                return mid;
            }
            else if(isAcs){
                if(target >arr[mid]){
                    s = mid+1;
                }
                else{
                    e = mid-1;
                }

            }
            else{
                if(target<arr[mid]){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }


            }
        }
        return e;

    }
    
}
