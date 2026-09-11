package number_program;

public class swap_number_without3rd {
	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println(a+ " "+ b);
	}

}
