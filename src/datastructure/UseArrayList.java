package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
	List<Integer> age = new ArrayList<Integer>();
	age.add(18);
	age.add(20);
	age.add(2,14);
	age.add(3,22);
	age.add(4,25);
	age.remove(4);

	for (int ages : age){
		System.out.println("For Each Loop: " + ages);
	}

	Iterator i = age.listIterator();
	while(i.hasNext()){
		System.out.println("Iterating with While Loop " + age);
		break;
	}


	}

}
