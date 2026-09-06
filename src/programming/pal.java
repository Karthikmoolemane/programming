package programming;

public class pal {
	public static void main(String[] args) {
		String s = "madam";
		String rev = "";
		for(int i = s.length()-1; i >=0; i--) {
			rev+= s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("palandrom");
		}
		else {
			System.out.println("not a palandrom");
			
		}
	}

}
