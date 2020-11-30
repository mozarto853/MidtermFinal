package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,poll elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		System.out.println("Thanksgiving line");
		Queue<String> queue = new LinkedList<>();

		queue.add("Prity");
		queue.add("Matiur");
		queue.add("Doug");
		queue.add("Mozart");
		queue.add("Jsan");
		System.out.println(queue);

		System.out.println("\nIterator with While Loop");
		Iterator it = queue.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		System.out.println("\n For each loop");
		for(String q : queue){
		System.out.println(queue);
}
		System.out.println("\n");
		System.out.println(queue);
		System.out.println(queue.poll() + " Got his food first and left the line");
		System.out.println(queue);
		System.out.println(queue.peek() + " is next");
		System.out.println(queue.remove() + "Got his food and left the party");
		System.out.println(queue);
	}

}
