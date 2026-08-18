public class FindFirstAndLastNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,4,4,5,5,7,7,};
        int target = 4;
        int[] result = findRange(arr,target);
        
        System.out.println(result[0]+","+result[1]);

    }

    static int[] findRange(int[] arr, int target){
        int[] ans = {-1,-1};

        ans[0] = searchFirstandLastNumber(arr,target,true);
        ans[1] = searchFirstandLastNumber(arr,target,false);

        return ans;

    }

    static int searchFirstandLastNumber(int[] arr, int target, boolean findFirstNumber){

        
        int ans = -1;
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
                ans = mid;
                if(findFirstNumber){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
               
            }
             
        }
        
        return ans;
    }


    
}
