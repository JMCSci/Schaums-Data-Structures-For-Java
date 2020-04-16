/* Chapter 6.9 */

package reverse;

import java.util.ArrayDeque;

public class Solution {
	public static void main(String[] args) {
		reverse();
	}
	
	// reverse: Reverses the contents of this queue 
	public static void reverse() {
		int size;
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		ArrayDeque<Integer> newQ = new ArrayDeque<Integer>();
		for(int i = 1; i < 11; i++) {
			queue.add(i * 11);
		}
		size = queue.size();
		
		System.out.println(queue);
		
		for(int i = 0; i < size ; i++) {
			newQ.push(queue.pop());
		}
		queue = newQ;
		System.out.println(queue);
	}

}

