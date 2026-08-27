package programming;

public class rev_every_words {
	public static void main(String[] args) {
		String s = "java is easy";
		String str[]= s.split(" ");
		
		for(String word : str) {
			for(int i = word.length()-1; i >= 0 ; i--) {
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");
		}
	}

}
