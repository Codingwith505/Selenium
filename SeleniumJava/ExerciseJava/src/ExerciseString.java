
public class ExerciseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "The quick brown fox jumps over the lazy dog ";
		char c = s.charAt(12);
		System.out.println(c);
		boolean Cont = s.contentEquals("is");
		System.out.println(Cont);
		String g = s.concat("and killed it");
		System.out.println(g);
		boolean p = s.endsWith("dog");
		System.out.println(p);
		boolean f =  s.contentEquals("The quick brown Fox jumps over the lazy Dog");
		System.out.println(f);
		boolean j = s.contentEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
		System.out.println(j);
		
		
	}

}
