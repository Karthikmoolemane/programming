package programming;

public class rev_order_words {
	public static void main(String[] args) {
		String s = "java is programming";
		String[] str = s.split(" ");
		
		for(int i = str.length-1; i >= 0; i--) {
			System.out.print(str[i]+ " ");
		}
	}

}
