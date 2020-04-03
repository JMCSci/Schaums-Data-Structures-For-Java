/* Chapter 3.3 */

package sum;

public class Solution {
	public static void main(String[] args) {
		Node list = new Node(25);
		list.add(45);
		list.add(65);
		list.add(85);
		sum(list);
	}
	
	// sum: Returns the sum of integers in the specified list
	public static int sum(Node list) {
		int sum = 0;
		
		for(Node p = list.head; p != null; p = p.next) {
			sum += p.data;
		}
		
		System.out.println(sum);
		return sum;
	}

}

class Node {
	int data;
	Node next;
	Node p;					// pointer
	Node head;				// head of list
	
	Node(int data) {
		this.data = data;
	}
	
	void add(int data) {
		if(head == null) {
			Node node = new Node(data);
			head = node;
			p = node;
		} else {
			p.next = new Node(data);
			p = p.next;
		}
	}
	
}
