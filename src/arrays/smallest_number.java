package arrays;

public class smallest_number {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int min = 100;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] < min) {
				min = a[i];
				
			}
		}
		System.out.println(min);
	}

}
