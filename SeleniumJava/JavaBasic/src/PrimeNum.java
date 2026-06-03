import java.util.Scanner;

public class PrimeNum {
    public static void main(String [] args){

        Scanner st = new Scanner(System.in);

        System.out.println("Enter the Number: Which you check it prime or not");
        int num = st.nextInt();
        

        if(num ==1){
            System.out.println("1 is not a prime or nor composite numver");
            
        }
        else if(num <1){
            System.out.println("Please give the valid number");
        }

        boolean isPrime = true;
        int c = 2;
        while(c<num){
            
             if(num%c==0) {
                isPrime = false;
                break;
            }
            c++;        
        }
        

        if(isPrime){
            System.out.println(num + " is a Prime Number");
        }
        else{
            System.out.println(num + " is not a Prime Number");
        }
         

    }
}

