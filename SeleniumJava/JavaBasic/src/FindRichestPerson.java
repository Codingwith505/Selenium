public class FindRichestPerson {

    public static void main(String[] args) {

        int [][] account = {{8,4,8},
                            {3,2,1},
                            {9,8,4}}
                            ;
        compareWealth(accounts(account));
        
    }

    static int[] accounts(int[][] accounts){
        
        int[] arr = new int [accounts.length];
        for(int i = 0; i<accounts.length;i++){
            int total = 0;
            
            for(int j= 0; j<accounts[i].length;j++){
                total+= accounts[i][j];
                         
            }
            arr[i]=total; 
        }
        return arr;

    }
    


    static void compareWealth(int[]arr){
        int max = arr[0];
        int person = 0;
        for(int i = 1; i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
                person = i+1;
            }
        }
        if (person>0) {
            System.out.println("Customer"+person+" is Richest person, wealth is "+max + ".");
        }
        else if(person==0 & arr[0]==arr[1]){
            System.out.println("All are same wealth " +max+ ".");
            
        }
        else if(person==0){
            System.out.println("Customer1 is Richest person, wealth is "+max + ".");
        }

    }


    
}
