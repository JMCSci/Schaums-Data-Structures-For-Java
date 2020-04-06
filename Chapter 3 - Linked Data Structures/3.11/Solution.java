/* Chapter 3.11 */

package put;

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
		list.put(list, 3, 50);
		list.traverse();
	}

}

class Node {
	int data;
	int index;
	Node next;
	
	
	Node(int data){
		this.data = data;
	}
}

class LinkedList {
	Node head;
	Node tail;
	int size = 0;
	
	
	LinkedList() {
		
	}
	
	void insert(int data) {
		Node node = new Node(data);
		if(tail == null) {
			head = tail = node;
			node.index = 0;
			size++;
		} else {
			tail.next = node;
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
	
	int size() {
		return size;
	}
	
	// put: Inserts x as element number i
	void put(LinkedList list, int i, int x) {
		Node current = head;
		Node node = new Node(x);
		while(current != null) {
			if(i == 0) {
				if(current.index == i) {
					Node temp = current;
					head = current = node;
					current.next = temp;
					size++;
					if(current.next == null) {
						current = tail;
					}
					// All the nodes after this index will have to move up by one
					while(current != null) {
						current.index = i;
						i++;
						current = current.next; 
					}
					break;
				}	
			} else if(current.next.index == i) {
				Node temp = current.next;
				current = current.next = node;
				current.next = temp;
				size++;
				if(current.next == null) {
					current = tail;
				}
				// All the nodes after this index will have to move up by one
				while(current != null) {
					current.index = i;
					i++;
					current = current.next;
				}
				break;
			} 
			current = current.next;
			}
		}
	
}
