// Program For Insertion In Doubly Linked List.

public class LinkedList15 {
	
	Node head;

	class Node {
		int data;
		Node prev;
		Node next;

		Node(int d) {
			data = d;
		}
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;

		if(head != null)
			head.prev = new_node;
		head = new_node;	
	}

	public void InsertAfter(Node prev_node, int new_data) {
		if(prev_node == null) {
			System.out.println("The Given Previous Node Cannot Be Null!!!");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		new_node.prev = prev_node;

		if(new_node.next != null)
			new_node.next.prev = new_node;
	}

	void append(int new_data) {
		Node new_node = new Node(new_data);
		Node last = head;

		new_node.next = null;
		if(head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}
		while(last.next != null)
			last = last.next;
		last.next = new_node;
		new_node.prev = last;	
	}

	public void printList(Node node) {
		Node last = null;
		System.out.println("Traversal In Forward Direction: ");
		while(node != null) {
			System.out.println(node.data + " ");
				last = node;
				node = node.next;
		}
		System.out.println();
		System.out.println("Traversal In Reverse Direction: ");
		while(last != null) {
			System.out.println(last.data + " ");
			last = last.prev;
		}
	}


	public static void main(String args[]) {
		LinkedList15 llist = new LinkedList15();
		llist.append(6);
		llist.push(7);
		llist.push(1);
		llist.append(4);
		llist.InsertAfter(llist.head.next, 8);
		System.out.println("Created Doubly Linked List: ");
		llist.printList(llist.head);
	}
}