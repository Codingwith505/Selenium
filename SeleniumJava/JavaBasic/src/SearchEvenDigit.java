

public class SearchEvenDigit {

    public static void main (String[] args){


        int[] arr = {23,0,456,890,-1243,-234,89,75674,789845632,892435,231,986};
       int result =  findNumber(arr);
       System.out.println("Mathematical Solution: "+result);
       int result1 =  convertInString(arr);
       System.out.println("String Based: "+result1);
    }


    static int findNumber(int[] arr){

        if(arr.length==0){
            return 0;
        }

    
        int total = 0;
        for (int j : arr) {
            j =Math.abs(j);
            int count =0;
            while(j>0){
                j= j/10;
                count++;
            }
            total += findEvenNumber(count);
            
        }
        return total;

    }


    static int findEvenNumber(int n){

        if(n==0){
            return 0;
        }
        else if(n%2==0){
            return 1;
        }
        return 0;
    }

    static int convertInString(int[] arr){
        int count = 0;
        if(arr.length==0){
            return -1;
        }
        for (int i : arr) {
            i = Math.abs(i);
            String str = String.valueOf(i);
            int value = str.length();
             int count1 = evenNumber(value,0);
             count = count+count1;          
        }
        return count;
        
    }

    static int evenNumber(int value,int count){
        if (value==0) {
            return 0;
        }
        if(value%2==0){
            return count=+1;
        }
        return 0;
    }
    
}
