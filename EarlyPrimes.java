class EarlyPrimes {

	public static void main(String[] arguments) {
		findPrimes(100);
	}

	public static void findPrimes(int upperBound) {
		System.out.println("The prime numbers that occur prior to " +
					upperBound + " are the following: ");

		for (int i = upperBound; i <= upperBound; i--) {
			if (check(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean check(int value) {
		if (value <= 3) {
			return (value > 1);
		}
		else if (value % 2 == 0 || value % 3 == 0) {
			return false;
		}

		int i = 5;
		while (i * i <= value) {
			if (value % i == 0 || value % (i + 2) == 0) {
				return false;
			}
			i = i + 6;
		}
		return true;
	}
}