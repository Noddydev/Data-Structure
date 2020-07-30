// Delete Node In Given LinkedList

class LinkedList3 {
	
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void deleteNode(int key) {
		Node temp = head, prev = null;
		if(temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		while(temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		if(temp == null) return;
			prev.next = temp.next;
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data + " ");
			n= n.next;
		}
	}

	public static void main(String args[]) {
		LinkedList3 llist = new LinkedList3();
		llist.push(7);
		llist.push(1);
		llist.push(3);
		llist.push(2);
		System.out.println("Created Linked List: ");
		llist.printList();

		llist.deleteNode(1);
		System.out.println("Linked List After Deletion: ");
		llist.printList();

	}
} 