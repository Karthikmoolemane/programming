package programming;

public class Using_Recursion {
	static String rev(String s) {
		if(s.isEmpty()) {
			return s;
		}
		return rev(s.substring(1)) + s.charAt(0);
		
	}
	public static void main(String[] args) {
		String s = "Karthik";
		System.out.println(rev(s));
	}
}
