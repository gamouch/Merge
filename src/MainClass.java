
/**
 * 
 * @author Toshiba
 * Commentaire simple.
 *
 */

public class MainClass {

	public static void main(String[] args) {
		

		//Title
		
		
		int data[]= {2, 42, 7, 14, 6};

		//My second test
		System.out.println("Initial Test.");
		System.out.println("Merge Test.");
		int sum = 0;
		int multip= 0;
		for (int i = 0; i < data.length; i++) {			
			System.out.println("Data n "+i+ ": " +data[i]);
			sum += data[i];
			multip -= data[i]; 
		}	
		// somme
		System.out.println("la somme est: "+sum);
		
		System.out.println("la multiplication est: "+multip);
		}


}
