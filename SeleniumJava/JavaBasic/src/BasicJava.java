
import java.util.Arrays;

public class BasicJava {

	
	/**
     * a3 am2 I1 boy4
     * I am a boy
     */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] str = {"1I", "boy4", "am2", "a3"};
		
		
		 for (int i = 0; i < str.length - 1; i++) {
	            for (int j = 0; j < str.length - 1 - i; j++) {
	                if (str[j].compareToIgnoreCase(str[j + 1]) > 0) {
	                    String temp = str[j];
	                    str[j] = str[j + 1];
	                    str[j + 1] = temp;
	                }
	            }
	        }

	        System.out.println(Arrays.toString(str));
	}

}
