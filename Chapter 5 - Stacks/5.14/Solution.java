package solution;

import java.util.Deque;
import java.util.ArrayDeque;

public class Solution {
	public static void main(String[] args) {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(-441);
		stack.push(163);
		stack.push(-3);
		stack.push(52);
		stack.push(71);
		System.out.println(popBottom(stack));
	}
	
	// popBottom: Removes and returns the bottom element of the specified stack
	public static <E> E popBottom(Deque<E> stack) {
		E e = null;
		while(!stack.isEmpty()) {
			e = stack.pop();
		}
		
		return e;
	}

}
