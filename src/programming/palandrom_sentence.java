package programming;

public class palandrom_sentence {
	public static void main(String[] args) {
		String s = "madam is level";
		String[] str= s.split(" ");
		
		for(String s1 : str) {
			String rev = "";
			for(int i = s1.length()-1;i >=0;i--) {
				rev+=s1.charAt(i);
			}
			if(s1.equalsIgnoreCase(rev)) {
				System.out.println("pal");
			}
			else {
				System.out.println("not a pal");
			}
			
		}
	}

}
