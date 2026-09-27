public class Factorial {

    public static void main(String[] args){
        
        factorial(6);
        System.out.println(fact(6));
    }

    static void factorial(int n){

        int m =1;
        for(int i =1; i<=n; i++){
            m =m*i;
        }
        System.out.println(m);
    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    
}
