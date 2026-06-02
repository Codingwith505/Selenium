import java.util.Scanner;

public class MathsChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// Read input values
		int k = sc.nextInt(); // Target streak value
		int N = sc.nextInt(); // Upper limit to check

		int count = 0; // To count how many numbers have streak == k

		for (int n = 2; n <= N; n++) {
			int streak = 0;
			int tempK = 1;

			do {
				if ((n + streak) % (streak + 1) == 0) {
					streak++;
				} else {
					break;
				}
			} while (true);

			if (streak == k) {
				count++;
			}
		}

		System.out.println(count);
	}

}
