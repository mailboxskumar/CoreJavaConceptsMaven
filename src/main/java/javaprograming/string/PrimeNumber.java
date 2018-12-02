package javaprograming.string;

public class PrimeNumber {

	public static void main(String[] args) {

		int maxNo = 10;
		boolean flag = true;

		for (int i = 2; i <= maxNo; i++) {
			flag = isPrime(i);
			if (flag)
				System.out.println(i + " is a prime number");
		}

	}

	public static boolean isPrime(int numberToCheck) {
		int remainder;
		for (int i = 2; i <= numberToCheck/2; i++) {
			remainder = numberToCheck % i;
			if (remainder == 0) {
				return false;
			}
		}
		return true;
	}
}
