/* Chapter 3.2 */

package size;

public class Solution {
	public static void main(String[] args) {
		Node list = new Node(33);
		list.insert(55);
		list.insert(77);
		list.insert(99);
		size(list);	
	}
	
	// size: Returns the number of nodes in the specified list
	public static int size(Node list) {
		System.out.println(list.size);
		return list.size;
	}

}

class Node {
	int data;
	int size;
	Node next;			// next node
	Node head;			// pointer
	
	
	Node (int data) {
		this.data = data;
		size = 1;
	}
	
	void insert(int data) {
		if(head == null) {
			Node node = new Node(data);
			head = node;
			size++;
		} else {
			Node p = head;
			while(p != null) {
				if(p.next == null) {
					p.next = new Node(data);
					size++;
					break;
				}
				p = p.next;

			}
			
			
		}
		
	}
		
	int size() {
		return size;
	}

}
