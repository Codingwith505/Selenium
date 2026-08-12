public class FindMaxMinNumber {
    
    public static void main(String[] args) {
        
        int[] arr = {7,90,27,84,72,90,103,170,890,82748,6778,2892,6782};
        
        int max = maxValue(arr);
        System.out.println("Maximum number of array: "+max);
        int min = minValue(arr);
        System.out.println("Minimum number of array: "+min);
        
    }

    static int maxValue(int[]arr){
        if(arr.length ==0){
            return -1;
        }

        int max = arr[0];

        for (int i= 1; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;  
    }

    static int minValue(int[]arr){
        if(arr.length==0){
            return -1;
        }
        int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(min>arr[i]){
                min =arr[i];
            }
        }
        return min;

    }
    
}
