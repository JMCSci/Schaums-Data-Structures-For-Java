/* Chapter 3.13
 * This code works but can be improved. Will fix at a later date.
 */

package merged;

public class Solution {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		LinkedList list3 = new LinkedList();
		list1.insert(22);
		list1.insert(33);
		list1.insert(55);
		list1.insert(88);
		list2.insert(44);
		list2.insert(66);
		list2.insert(77);
		list2.insert(99);
		list3 = list1.merged(list1, list2);
		list3.traverse();
	}

}

class Node {
	int data;
	int index; 
	Node next;
	Node prev;
	
	Node(int data) {
		this.data = data;
	}
	
}

class LinkedList {
	int size;
	Node head;
	Node tail;
	
	LinkedList() {
		
	}
	
	void insert(int data) {
		Node node = new Node(data);
		if(tail == null) {
			head = tail = node;
			size = 1;
			node.index = size - 1;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = tail.next;
			size++;
			node.index = size - 1;
		}
		
	}
	
	void traverse() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	void traverseBackward() {
		Node current = tail;
		while(current != null) {
			System.out.println(current.data);
			current = current.prev;
		}
	}
	
	// merged: Returns a new list that contains all the elements of list1 and list2
	LinkedList merged(LinkedList list1, LinkedList list2) {
		LinkedList list3 = new LinkedList();
		Node current1 = list1.head;
		Node current2 = list2.head;
		
		for(Node p1 = current1; p1 != null; p1 = p1.next) {
			for(Node p2 = current2; p2 != null; p2 = p2.next) {
				if(p1.data < p2.data) {
					list3.insert(p1.data);
					if(p1.next == null) {
						// If necessary, add remaining numbers in second list
						while(current2 != null) {
							if(current2.data > p1.data) {
								list3.insert(current2.data);	
							}
							current2 = current2.next;
						}
					}
					break;
				} else {
					list3.insert(p2.data);
					
				}
			}
		}
		return list3;
	}
			
	
}
