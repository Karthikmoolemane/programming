package programming;

public class rev_char_not_numbers {
	public static void main(String[] args) {
		String s = "a1b2c3d";
		char[] ch = s.toCharArray();
		int i = 0 , j = ch.length-1;
		while(i<j) {
			if(!Character.isLetter(ch[i])){
				i++;
			}
			else if (!Character.isLetter(ch[j])) {
				j--;
			}
			else {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;
				j--;
			}
			
		}
		System.out.println(ch);
	}

}
