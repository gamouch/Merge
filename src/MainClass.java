
/**
 * 
 * @author Toshiba
 * Commentaire simple.
 *
 */

public class MainClass {

	public static void main(String[] args) {
		
		int data[]= {2, 42, 7, 14, 6};
		//My second test
		System.out.println("Third Test.");

		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			System.out.println("Data n "+i+ ": " +data[i]);
			sum += i;
		}
		System.out.println("La somme est :" +sum);				
		}


}
