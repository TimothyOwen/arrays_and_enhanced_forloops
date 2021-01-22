package arrays;

public class EnhancedForLoop1 {
	private static boolean truth(int num2) {
		//Question 3
		if(num2%2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		//Question 1
		String[] demo = {"My","Dog","is","red","on","the","underbelly","Jeff"};
		for(String i: demo) {
			System.out.println(i);
		}
		System.out.println("\n\n\n\n\n");
		//Question2
		int[] demo2 = new int[20];
		for(int i = 0; i<20; i++) {
			demo2[i] = i+1;
		}
		for(int i: demo2) {
			i = i * i;
			System.out.println(i);
		}
		System.out.println("\n\n\n\n\n");
		//Question 4
		for(int i: demo2) {
			if(truth(i)) {
				i = i * i * i;
				System.out.println(i);
			}else {
				i = i * i;
				System.out.println(i);
			}
		}
	}
}
