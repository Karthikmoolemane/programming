package programming;

public class rev_using_normal {
	public static void main(String[] args) {
		String s = "java is easy";
		String[] str = s.split(" ");
		for(String word:str) {
			String rev = " ";
			for(int i = word.length()-1; i >= 0; i--) {
				rev = rev + word.charAt(i);
				
			}
			System.out.print(rev);
			
		}
	}

}
