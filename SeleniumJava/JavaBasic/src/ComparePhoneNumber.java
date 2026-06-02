import java.util.Scanner;

public class ComparePhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Name");
		String name = scanner.nextLine();

		System.out.println("Enter UserName");
		String userName = scanner.nextLine();

		System.out.println("Enter Password");
		String password = scanner.nextLine();

		System.out.println("Enter PhoneNumber");
		Long phoneNumber = scanner.nextLong();
		scanner.nextLine();
		User user1 = new User(name, userName, password, phoneNumber);

		System.out.println("Enter Name");
		String name1 = scanner.nextLine();

		System.out.println("Enter UserName");
		String userName1 = scanner.nextLine();

		System.out.println("Enter Password");
		String password1 = scanner.nextLine();

		System.out.println("Enter PhoneNumber");
		Long phoneNumber1 = scanner.nextLong();

		User user2 = new User(name1, userName1, password1, phoneNumber1);

		if (user1.comparePhoneNumber(user2)) {
			System.out.println("Same Users");
		} else {
			System.out.println("Different Users");
		}
	}

}
