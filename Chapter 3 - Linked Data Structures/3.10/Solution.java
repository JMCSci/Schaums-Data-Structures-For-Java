/* Chapter 3.10 */

package get;

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
		list.get(list, 2);	
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
	
	LinkedList() {
			
	}
	
	void insert(int data) {
		Node node = new Node(data);
		if(tail == null) {
			head = tail = node;
			node.index = index;
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
	
	// get: Returns the value of the element in i
	int get(LinkedList list, int i) {
		Node current = head;
		while(current != null) {
			if(current.index == i) {
				System.out.println(current.data);
				return current.data;
			}
			current = current.next;
		}
		return -1;
	}
	
}
