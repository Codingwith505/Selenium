import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle");
		int lg = sc.nextInt();
	
		System.out.println("Enter the width of the rectangle");
		int wd = sc.nextInt();
		
		Rectangle rt = new Rectangle();
		rt.display(lg, wd);
		int result = rt.intergerarea(lg, wd);
		System.out.println("Area of the Rectangle:"+ result);
		
		System.out.println("Enter the new dimension");
		int nd = sc.nextInt();
	}

}
