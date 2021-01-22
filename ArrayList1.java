package arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayList1 {
	public static void main(String[] args) {
		List<String> demo = new ArrayList<>();
		demo.add("Nice to meet you");
		demo.add("What's up?");
		demo.add("Hello");
		demo.add("Bonjour");
		demo.add("Ciao");
		System.out.println(demo);
		for(String i: demo) {
			System.out.println(i);
		}
		String get = demo.get(1);
		System.out.println(demo);
		demo.set(0, get);
		System.out.println(demo);
		demo.remove(2);
		System.out.println(demo);
		Collections.sort(demo);
		System.out.println(demo);
		Collections.reverse(demo);
		System.out.println(demo);
		Collections.swap(demo,0,3);
		System.out.println(demo);
	}
}
