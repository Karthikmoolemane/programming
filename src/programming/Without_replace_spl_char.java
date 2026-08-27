package programming;

public class Without_replace_spl_char {
	public static void main(String[] args) {
		String s = "ab@bvf&khf$ef";
		char[] ch = s.toCharArray();
		int i = 0, j = ch.length-1;
		while(i<j) {
		if(!Character.isLetter(ch[i])) {
			i++;
		}
		else if (!Character.isLetter(ch[i])) {
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
