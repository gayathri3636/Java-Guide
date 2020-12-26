package example;
import java.util.*;

public class setInterface {
//set doesnt support duplicate elements
	public static void main(String[] args) {
//********************hashset--used to store elements in hashset
		Set<Integer> unique = new HashSet<Integer>();
		unique.add(2);
		unique.add(3);
		unique.add(6);
		unique.add(3);
		for(int o3: unique) {
			System.out.println(o3);//2,3,6
		}
//**********************Treeset--outputs in a sequence which is ascending order		
		Set<Integer> unique1 = new TreeSet<Integer>();
		unique1.add(2);
		unique1.add(32);
		unique1.add(6);
		unique1.add(34);
		for(int o3: unique1) {
			System.out.println(o3);//2,3,6
		}
	}

}
