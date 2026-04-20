package lab1;
import java.util.*;
public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		System.out.println("Before sorting:");
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println("After sorting:");
		System.out.println(ls);
	}

}