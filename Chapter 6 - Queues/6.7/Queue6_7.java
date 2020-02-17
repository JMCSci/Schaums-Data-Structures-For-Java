package queue6_7;

import java.util.Queue;
import java.util.ArrayDeque;

public class Queue6_7 {
	public static void main(String[] args) {
		Queue<String> queue = new ArrayDeque<>();
		queue.add("Barbara");
		queue.add("Molly");
		queue.add("Sam");
		queue.add("Richard");
		removeLastElement(queue);
	}
	
	/*removeLastElement: Removes the last element in the specified queue */
	public static <E> void removeLastElement(Queue<E> queue) {
		for(int i = 0; i < queue.size(); i++) {
			if(i == queue.size() - 1) {
				queue.remove();
				break;
			}
			queue.add(queue.remove());
		}
		System.out.println(queue);
	}

}
