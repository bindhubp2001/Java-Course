
public class PrimeNumber {

	public static void main(String[] args) {

		int number = 2;
		
		for (int i = 1; i < number/2; i++) {
			
			if (number % i == 0) {
				System.out.println("NOt Prime");
			} else {
				System.out.println("prime");
			}
		}

	}

}
