package solution;

import java.util.Deque;
import java.util.ArrayDeque;

public class Solution {
	public static void main(String[] args) {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(9);
		stack.push(77);
		stack.push(42);
		stack.push(19);
		System.out.println(bottom(stack));
		
	}
	
	// bottom: Returns the bottom element of the specified stack
	public static <E> E bottom(Deque<E> stack) {
		E e = null;
		int size = stack.size() - 1;
		for(int i = 0; i < size; i++) {
			stack.pop();
		}
		e = stack.peek();
		
		return e;
	}
}
