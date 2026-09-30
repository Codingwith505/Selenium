public class DuplicateNumber {

    public static void main(String[] args){
        int[] nums = {3,3};
        boolean result = containsDuplicate(nums);

        System.out.println(result);

    }

    static boolean containsDuplicate(int[] nums) {

        int i = 0;

        while(i<nums.length){

          if(nums[i]<1 || nums[i] > nums.length){
            i++;
            continue;
          }  
            if(nums[i]!= i+1){
                int correct = nums[i]-1;
                if(nums[i]!= nums[correct]){
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                }
                else{
                    return true;
                    }
                   
                
            }
            else{
                i++;
            }
        }

        return false;
    }
     
}
