public class SearchElement {


    public static void main(String[] args) {

        int target = 0;
        int[] array = {23,43,78,46,78,99,73,9,67};

        searchElement(target,array);
    }

    static  void searchElement(int target, int[] arr){
        for(int i = 0; i< arr.length;i++){
            if(arr[i]==target){
                System.out.println(arr[i]);
                
            }
        }
        

    }
    
}
