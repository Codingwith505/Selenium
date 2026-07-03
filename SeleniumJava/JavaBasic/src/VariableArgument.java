
public class VariableArgument {
    public static void main(String[] args) {
        sum(1,2,3,5);
    }

    static void sum(int ...v){
        
        for (int i : v) {
            int s = 0;
            s = s+i;
            System.out.print(s);
        }

    }

    static void multiply(int a, int b){

    }

    static void multiply(int a, int b,int c){

    }
    
}
