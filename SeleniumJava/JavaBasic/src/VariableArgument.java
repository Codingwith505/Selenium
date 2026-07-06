
public class VariableArgument {
    public static void main(String[] args) {
        sum(1,2,3,5);

       
    }

    static void sum(int ...v){
               int s = 0;
        for (            int i : v) {
            
            s = s+i;
            
        }
        System.out.println(s);

    }

    
    
}
