package number_program;

public class count_number_digit {
	public static void main(String[] args) {
		int n = 12434;
		int count = 0;
		
		while(n > 0) {
			n = n / 10;
			count++;
		}
		System.out.println(count);
	}

}
