package lab1;

import java.util.*;
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		System.out.println(ls);
		if(ls.contains("red")) {
			System.out.println("available");
		}else {
			System.out.println("available not");
		}
	}

}