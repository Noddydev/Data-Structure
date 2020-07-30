// Program To Find Length Of A LinkedList

class LinkedList5 {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public int getCount() {
		Node temp = head;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public static void main(String args[]) {
		LinkedList5 llist = new LinkedList5();
		llist.push(1);
		llist.push(3);
		llist.push(1);
		llist.push(2);
		llist.push(1);
		System.out.println("Count Of Nodes Is " + llist.getCount());
	}
}