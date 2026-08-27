package programming;

public class Using_CharacterArray {
	public static void main(String[] args) {
		String s = "Karthik";
		char[] ch = s.toCharArray();
		
		for(int i = ch.length-1;i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}

}
