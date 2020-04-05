/* Chapter 3.8 */

package set;

public class Solution {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(22);
		list.insert(33);
		list.insert(44);
		list.insert(55);
		list.insert(66);
		list.insert(77);
		list.insert(88);
		list.insert(99);
		System.out.println("### LIST 1 ###");
		list.traverse();
		list.set(list, 2, 50);
		System.out.println("\n### LIST 1 ###");
		list.traverse();	
	}

}

class Node {
	int data;
	Node next;
	int index;
	
	Node(int data) {
		this.data = data;
	}
	
}

class LinkedList {
	Node head;
	Node tail;
	int index = 0;
	
	
	void insert(int data) {
		Node node = new Node(data);
		if(tail == null) {
			head = tail = node;
		} else {
			tail.next = node;
			tail = tail.next;
			index += 1; 
			node.index = index;
		}
		
	}
	
	void traverse() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	// set: Replaces the value of element number i with x
	void set(LinkedList list, int i, int x) {
		Node current = list.head;
		while(current != null) {
			if(i == current.index) {
				current.data = x;
				break;
			} 
			current = current.next;
		}
	}
	
}
