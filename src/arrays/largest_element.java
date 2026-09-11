package arrays;

public class largest_element {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};

        int max = 0;

        for (int i = 1; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println(max);
    }
}