public class MoutainPeak {

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,5,4,3,2,1};
        System.out.println(searchHighestNumber(arr));
        
    }

    static int searchHighestNumber(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;

            if(arr[mid]<arr[mid+1]){
                //increasing the moutain towards the peak
                start = mid+1;
            }
            else {
                //decreasing the mautain towards the peak
                end = mid;
            }
            
        }
        return start;
    }
    
}
