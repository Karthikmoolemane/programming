package programming;

public class Reverse_entire_string_including_spaces {
	public static void main(String[] args) {
		String s = "java is easy";
		char[] str = s.toCharArray();
		int i = 0, j = str.length-1;
		
		while(i<j) {
			char temp = str[i];
			str[i] = str[j];
			str[j] = temp;
			i++;
			j--;
		}
		System.out.println(str);
		
	}

}
