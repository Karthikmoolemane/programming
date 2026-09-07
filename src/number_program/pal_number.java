package number_program;

public class pal_number {
	public static void main(String[] args) {
		int n = 121;
			int rev = 0;
			int ori = n;
			
			while(n > 0) {
				int dig = n % 10;
				rev = rev * 10  + dig;
				n = n / 10;
			}
			
			
	
	if(ori == rev) {
		System.out.println("pal");
		
	}
	else {
		System.out.println("not a pal");
	}
	}

}
