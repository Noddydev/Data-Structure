//  Program To Reverse A Doubly Linked List

class LinkedList17 {
	static Node head;
	static class Node {
		int data;
		Node next, prev;
		Node(int d) {
			data = d;
			next = prev = null;
		}
	}

	void reverse() {
		Node temp = null;
		Node current = head;
		while(current != null) {
			temp = current.prev;

			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}
		if(temp != null) {
			head = temp.prev;
		} 
	}

	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.prev = null;
		new_node.next = head;
		if(head != null) {
			head.prev = new_node;
		}
		head = new_node;
	}

	void printList(Node node) {
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String args[]) {
		LinkedList17 llist = new LinkedList17();
		llist.push(2);
		llist.push(4);
		llist.push(8);
		llist.push(10);
		System.out.println("Original Linked List: ");
		llist.printList(head);
		llist.reverse();
		System.out.println(" ");
		System.out.println("The Reverse Linked List: ");
		llist.printList(head);
	}
}