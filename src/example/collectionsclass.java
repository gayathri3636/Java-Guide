package example;

import java.util.*;

public class collectionsclass {

	public static void main(String[] args) {
		List<Integer> values21 = new ArrayList<Integer>();
		values21.add(10);
		values21.add(3);
		values21.add(2);
		Collections.sort(values21);
		Collections.reverse(values21);
		for(Integer o1: values21) {
			System.out.println(o1);
		}
	}

}
