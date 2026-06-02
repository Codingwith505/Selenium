import java.util.Scanner;

public class DisplayItemType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the item type name");
		String name = sc.nextLine();
		
		
		
		
		System.out.println("Enter the cost per day");
		Double costPerDay = sc.nextDouble();
		
		System.out.println("Enter the deposit");
		Double deposit = sc.nextDouble();
		
		ItemType it =new ItemType();
		it.setName(name);
		it.setCostPerDay(costPerDay);
		it.setDeposit(deposit);
		
		it.Display();
	}
	
	

}
