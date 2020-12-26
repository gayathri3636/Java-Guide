package example;
import java.util.*;

public class collectionandgenerics {

	public static void main(String[] args) {
//****************************collections and Iterator
		Collection<Integer> values = new ArrayList<Integer>();
		values.add(2); //Integer values = new Integer(4);its a wrapper class
		values.add(5);
		//cannot add string values only integer
		//By using generics we can add only integers in values
		//values.add("gasa");
		System.out.println(values);
		//Iterator iterates over collection
		Iterator<Integer> it = values.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//******************************List and arrayList
//List interface is the child interface of Collection interface. It inhibits a list type
//data structure in which we can store the ordered collection of objects. It can have 
//duplicate values.
		List<Integer> values1 = new ArrayList<Integer>();
		values1.add(1);
		values1.add(3);
		values1.add(0, 8); //we can specify index and value here.so its an ordered list.
		//normal for loop
		for(int i=0;i<values1.size();i++) {
			System.out.println(values1.get(i));
		}
		//enhanced for loop
		for(Integer o: values1) { //object because values1 are wrapper class
			System.out.println(o);
		}
	}

}
