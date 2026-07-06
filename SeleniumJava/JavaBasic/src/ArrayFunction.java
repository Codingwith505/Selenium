
import java.util.Scanner;

public class ArrayFunction {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // square pattern 

        //Left Triangle
        System.out.println("Enter the number for pattern");
        int Ta= sc.nextInt();
        squarePattern(Ta);
        leftAngle(Ta);
        invertedLeftTriangle(Ta);

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

    //Inverted Left Triangle

    static void invertedLeftTriangle(int n){

        for(int i = n;0<=i;i--){
            for(int j = 0; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        

    }
}
    

