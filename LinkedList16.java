// Program For Delete Node In A Doubly Linked List.

public class LinkedList16 {
	
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

	public void printList(Node node) {
		Node last = null;
		while(node != null) {
			System.out.println(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.println();
	}

	void deleteNode(Node head_ref, Node del) {
		if(head == null || del == null){
			return;
		}
		if(head == del) {
			head = del.next;
		}
		if(del.next != null) {
			del.next.prev = del.prev;
		}
		if(del.prev != null) {
			del.prev.next = del.next;
		}
		return;
	}

	public static void main(String args[]) {
		LinkedList16 llist = new LinkedList16();
		llist.push(2);
		llist.push(4);
		llist.push(8);
		
		System.out.println("Created Doubly Linked List: ");
		llist.printList(llist.head);
		llist.deleteNode(llist.head, llist.head);

		System.out.println("List After Deleting First Node: ");
		llist.printList(llist.head);
		llist.deleteNode(llist.head, llist.head.next);

		System.out.println("List After Deleting Middle Node: ");
		llist.printList(llist.head);
	}
}