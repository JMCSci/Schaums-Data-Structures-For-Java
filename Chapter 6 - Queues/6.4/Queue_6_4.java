package queue6_4;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class Queue6_4 {
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		for(int i = 1; i <= 4; i++) {
			queue.add(i);
		}
		reverse(queue);
		
	}
	
	/* reverse: Reverse the elements in the specified queue */
	public static <E> void reverse(Queue<E> queue) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		while(!queue.isEmpty()) {
			deque.push((Integer)queue.remove());
		}
		System.out.println(deque);
	}

}
