public class RotededArray {
    public static void main(String[] args){
        int[] nums = {4,6,8,10,12,0,1,2};
        int target = 8;

        System.out.println(findtarget(nums,target));
        
    }

    static int findtarget(int[] nums, int target){
        int peak = findPeak(nums);

        if(peak == -1){
            return binarySearch(nums,0,nums.length-1,target);
        }

        if(nums[peak] == target){
            return peak;
        }
        if(target>=nums[0]){
           return binarySearch(nums, 0, peak, target);
        }

        return binarySearch(nums, peak+1, nums.length-1, target);
        
    }

    static int findPeak(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid = start+(end-start)/2;

            if(nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[start]>nums[mid]){
                end = mid;
                
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] nums, int start, int end, int target){

        while(start<=end){
            int mid = start+(end-start)/2;

            if(target == nums[mid]){
                return mid;
            }
            else if (target < nums[mid]) {
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    
}
