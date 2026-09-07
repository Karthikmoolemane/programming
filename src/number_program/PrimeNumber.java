package number_program;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 2;
		boolean isprime = true;
		if(n < 2) {
			isprime = false;
		}
		else {
			for(int i = 2;i * i <= n;i++) {
				if(n % i ==0) {
					isprime = false;
					break;
				}
			}
		}
		if(isprime) {
			System.out.println("number is prime");
			
		}
		else {
			System.out.println("number is not prime");
		}
	}

}
