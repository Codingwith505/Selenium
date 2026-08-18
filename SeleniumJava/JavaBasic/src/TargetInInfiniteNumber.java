public class TargetInInfiniteNumber {

    public static void main(String[] args){
        int [] arr = {12,23,34,45,67,78,89,90,100,120,130,150,180,250,390,400,580,690,710,830,900,1000};
        int target = 120;

        int ans = findSearchRange(arr,target);
        System.out.println(ans);

    }

    static int findSearchRange(int [] arr, int target){
        int s= 0;
        int e = 1;

        while(target>arr[e]){
            int newStart = e+1;
            e = e+(e-s+1)*2;
            s=newStart;   
        }
        return findValueInInfiniteNumber(arr,target,s,e);
    }

    static int findValueInInfiniteNumber(int[] arr, int target, int s, int e){

        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return -1;

    }
    
}
