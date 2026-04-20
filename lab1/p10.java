package lab1;
import java.util.*;
public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls = new LinkedList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		System.out.println("Before swapping");
		System.out.println(ls);
		Collections.swap(ls, 2, 3);
		System.out.println("After swapping");
		System.out.println(ls);
	}

}

