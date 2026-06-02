import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//		System.out.println();
//		int playerA = sc.nextInt();
//		int playerB = sc.nextInt();
//		int numberOfTurn = sc.nextInt();
//
//		if (numberOfTurn==1) {
//			int c = 2*playerA;
//			int res = c+playerB;
//			System.out.println(res);
//		}
//		
//		else if (numberOfTurn % 2 == 0) {
//			int n = numberOfTurn/2;
//			int c = 2*n*playerA;
//			int d = 2*n*playerB;
//			int res = c+d;
//			System.out.println(res);
//
//		} else if (numberOfTurn % 2 == 1) {
//			int n = Math.round(numberOfTurn/2);
//			int c = 2*n*playerA;
//			int d = 2*n*playerB;
//			int e = 2*playerA;
//			int res = c+d+e;
//			System.out.println(res);
//		}
		
		

		
		        Scanner sc = new Scanner(System.in);

		        // Reading inputs A, B, and N
		        int A = sc.nextInt();
		        int B = sc.nextInt();
		        int N = sc.nextInt();
		        sc.close();

		        // Richie starts first, so he gets the first multiplication
		        int Richie = A;
		        int Raechal = B;

		        // Applying the turn-based multiplication logic
		        for (int i = 0; i < N; i++) {
		            if (i % 2 == 0) { // Richie's turn (even indices: 0,2,4,...)
		                Richie *= 2;
		            } else { // Raechal's turn (odd indices: 1,3,5,...)
		                Raechal *= 2;
		            }
		        }

		        // Final score is the sum of both numbers after N turns
		        int finalScore = Richie + Raechal;
		        System.out.println(finalScore);
		    
		

//		
}}
