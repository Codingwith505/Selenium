import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int count = 0;
		for(int num = 2; count <n; num++) {
			if (isPrime(num)) {
				System.out.print(num+" ");
				count++;
			}
		}
		
		

	}
	
	public static boolean isPrime(int num) {
		int temp= 0;
		for (int i= 2; i <=num; i++) {
			if(num==2) {
				break;
			}
			if(num%i == 0 && i<num) {
				temp++;
			}
		}
		if(temp>=1) {
			return false;
		}
		else
		{
			return true;
		}
	}

}
