public class Search2D {

    public static void main(String[] args){
        int[][] arr = {
            {2,3,4},
            {7,8,12,15},
            {9,32}
        };

        int target = 32;

        int result = searchIN2D(arr,target);
        System.out.println(result);
        

    }

    static int searchIN2D(int[][] arr, int target ){

        if(arr.length==0){
            return -1;
        }

        for(int i = 0; i<arr.length;i++){
            for(int j=0; j< arr[i].length; j++){
                if(target == arr[i][j]){
                    return arr[i][j];
                }
            }
        }
        return -1;

    }
    
}
