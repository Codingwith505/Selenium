public class Recursion {

    public static void main (String[] args){
        countDown(5);

        

    }

    //recursion where recursion help to unlimited loop without help of loop
    static void countDown(int i){
        System.out.println(i);
        if(i<0){
        }
        else{
            countDown(i-1);
        }

    }
    
}
