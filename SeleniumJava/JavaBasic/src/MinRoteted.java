public class MinRoteted {

    public static void main (String[]args){
        int[] arr = {2,3,4,5,6,7,9};

        System.out.println(findMin(arr));

    }

    static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid = start+(end-start)/2;

            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            else if(nums[end]<nums[mid]){
            start=mid+1;
            }

            else{
                end =mid;
            }
        }
        return nums[start];
        
    }
}
    
