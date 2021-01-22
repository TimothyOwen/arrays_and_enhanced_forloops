package arrays;

public class Arrays2 {
	public static void main(String[] args) {
		int[] array = new int[10];
		for(int i=0; i<10; i++) {
			array[i] = i;
			System.out.println(array[i]);
		}
		for(int i: array) {
			array[i] *= 10;
			System.out.println(array[i]);
		}
	}
}
