public class SearchInRange {

    public static void main(String[] args){
        int[] arr= {24,12,35,76,85,90,74,38,56,82};
        int target = 82;
        

        int result = searchRange(arr,target,1,5);
        System.out.println(result);

    }

    static int searchRange(int[] arr, int target, int startRange, int endRange){
        if(arr.length == 0){
            return -1;
        }

        for(int i = startRange; i<endRange;i++){
            if(arr[i]==target){
                return arr[i];
            }
            
        }
        return -1;


    }

    
}
