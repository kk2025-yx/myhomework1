package Assignment2;

public class PrimeNumbers {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2; i < 101; i++) {
			boolean prime = true;
			for (int n = 2; n < i; n++) {

				if (i % n == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
