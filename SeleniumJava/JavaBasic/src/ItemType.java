
public class ItemType {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Double costPerDay;

	public Double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}

	private Double deposit;

	public Double getDeposit() {
		return deposit;
	}

	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	
	public void Display() {
		System.out.println("Item type details");
		System.out.println("Name:"+ name);
		System.out.printf("CostPerDay : %.2f\n", costPerDay);
		System.out.printf("Deposit : %.2f\n", deposit);
	}

}
