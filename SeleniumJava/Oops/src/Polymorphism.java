
public class Polymorphism {

	
	public class Person {
		public void checkPerson() {
			System.out.println("I'm a person");
		}
	}
	
	public class User extends Person{
		public void checkPerson() {
			System.out.println("I'm a User");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism poly = new Polymorphism();
		
		Person obj = poly.new User();
		obj.checkPerson();
	}

}
