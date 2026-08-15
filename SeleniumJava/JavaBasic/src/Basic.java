public class Basic {

    public static void main(String[] args) {
        int[] arr = {2,3,5,7,8,10};
        int target = 5;

        for(int i=0; i<arr.length; i++){
            if(target<arr[i]){
                System.out.println("E-1");
            }
            else if(target>arr[i]){
                System.out.println("s+1");
            }
        }

        
    }
    
}
