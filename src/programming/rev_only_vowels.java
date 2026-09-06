package programming;

public class rev_only_vowels {
	public static void main(String[] args) {
		String s = "ABIoihcydOIUSJ";
		char[] ch = s.toCharArray();
		int i = 0 , j = ch.length-1;
		while(i<j) {
			if(!isVowel(ch[i])) {
				i++;
			}
			else if (!isVowel(ch[j])) {
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

	private static boolean isVowel(char ch) {

		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' ||  ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
	}

}
