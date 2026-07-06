
import java.util.Scanner;

public class ArrayFunction {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        

        
        System.out.println("Enter the number for pattern");
        int Ta= sc.nextInt();
        // square pattern 
        squarePattern(Ta);
        //Left Triangle
        leftAngle(Ta);
        //Inverted Left Triangle
        invertedLeftTriangle(Ta);
        //Number Triangle
        numberTriangle(Ta);
        //Repeated Number Triangle
        RepeatedNumberTriangle(Ta);

        

    }

    static void squarePattern(int n){
        for(int i = 0; i<n; i++){
            for(int j= 0; j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void leftAngle(int n){
        for (int i = 1; i<= n;i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    

    static void invertedLeftTriangle(int n){

        for(int i = n;0<=i;i--){
            for(int j = 0; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void numberTriangle(int n) {
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void RepeatedNumberTriangle(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
    

