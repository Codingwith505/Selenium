public class FindCharBS {

    public static void main (String[] args){
        char[] arr = {'a', 'c', 'f', 'h', 'j', 'k'};
        char target = 'i';
        System.out.println(searchChar(arr,target));

    }

    // Optimal and clean Binary Search solution.
    // We use modulo (%) to handle the wrap-around case.
    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    static int searchChar(char[] arr, char target){

        int s = 0;
        int e = arr.length-1;


        while(s<=e){
            int mid = s+(e-s)/2;


            if(target<=arr[mid]){
                e=mid-1;
            }
            else {
                s=mid+1;
            }
            
        }
        // Modulo handles the wrap-around case.
        // Example: if s = 6 and arr.length = 6,
        // 6 % 6 = 0, so we return index 0.
        return s%arr.length;
    }



    // Alternative Binary Search solution.
    // It has the same time and space complexity as the first solution.
    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    // The first solution is cleaner because modulo handles the wrap-around case.
    static int searchChar2(char[] arr, char target){

        int s = 0;
        int e = arr.length-1;


        while(s<=e){
            int mid = s+(e-s)/2;


            if(target<arr[mid]){
                e=mid-1;
            }
            else if(target>arr[mid]){
                s=mid+1;
            }
            else{
                if(arr.length-1==mid){
                    return 0;
                }
                else{
                    return mid+1;
                }
            }
        }
        return s;
    }
    
}
