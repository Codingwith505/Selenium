import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String firstStr = sc.next();
		System.out.println("Enter the second string");
		String secondStr = sc.next();
		String subStr = firstStr.substring(3);
		System.out.println("Substring :" + subStr);
		char cha = firstStr.charAt(3);
		System.out.println("The character at 3rd position in the second string is :" + cha);
		boolean output = firstStr.equalsIgnoreCase(secondStr);
		System.out.println("Are string 1 and string 2 equal? :" + output);
		String concat = firstStr.concat(secondStr); 
		System.out.println("Concatenated string :" + concat);
	}

}
