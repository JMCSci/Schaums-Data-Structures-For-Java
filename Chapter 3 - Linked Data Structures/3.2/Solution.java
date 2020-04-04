/* Chapter 3.3 */

package sum;

public class Solution {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(25);
		list.add(45);
		list.add(65);
		list.add(85);
		sum(list);
	}
	
	// sum: Returns the sum of integers in the specified list
	public static int sum(LinkedList list) {
		int sum = 0;
		Node current = list.head;
		
		for(Node p = current; p != null; p = p.next) {
			sum += p.data;
		}
		
		System.out.println(sum);
		return sum;
	}

}

// Node class
class Node {
	int data;
	Node next;
	
	
	Node(int data) {
		this.data = data;
	}
	
}

// Wrapper class
class LinkedList {
	Node head;				// beginning of list
	Node tail;				// end of list
	
	LinkedList() {
		
	}
	
	void add(int data) {
		Node node = new Node(data);
		if(tail == null) {
			head = tail = node;
		} else {
			tail.next = node;
			tail = tail.next;
		}
			
	}
	
}
