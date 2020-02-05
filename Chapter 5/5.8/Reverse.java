/* Chapter 5.8
 * Program returns a new stack that contains the same elements as the given stack but in reverse order
 */


package shaums;

import java.util.Deque;
import java.util.Collections;
import java.util.ArrayDeque;

public class Reversed {
	public static void main(String[] args) {
		Deque<Integer> deque1= new ArrayDeque<Integer>();
		Collections.addAll(deque1, 1,2,3,4,5);
		reversed(deque1);
	}
	
	public static <E> Deque <E> reversed(Deque<E> stack){
		Deque<E> deque2 = new ArrayDeque<E>();
		while(!stack.isEmpty()) {
			deque2.push(stack.pop());
		}
		System.out.println(deque2);
		return stack;
	}

}
