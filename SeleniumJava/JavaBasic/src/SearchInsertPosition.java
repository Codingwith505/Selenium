public class SearchInsertPosition {

    public static void main(String[] args) {

        //https://leetcode.com/problems/search-insert-position/?envType=problem-list-v2&envId=binary-search

        int [] arr = {1,2,4,6,8,9,14,27};
        int target = 12;
        System.out.println(searchInsert(arr,target));
        
    }

    static int searchInsert(int arr[], int target){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start;
    }
    
}
