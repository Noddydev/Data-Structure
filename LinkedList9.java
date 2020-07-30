// Program To SWAP node in a linked list without swapping data.

class LinkedList9 {
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

	public void SwapNodes(int x, int y) {
		if(x == y)
			return;

		Node prevx = null, currx = head;
		while(currx != null && currx.data != x)
 		{
 			prevx = currx;
 			currx = currx.next;
 		}

 		Node prevy = null, curry = head;
 		while(curry != null && curry.data != y)
 		{
 			prevy = curry;
 			curry = curry.next;
 		}

 		if(currx == null || curry == null)
 			return;
 			if(prevx != null)
 				prevx.next = curry;
 			else
 				head = curry;

 			
 			if(prevy != null)
 				prevy.next = currx;
 			else 
 				head = currx;


 			Node temp = currx.next;
 			currx.next = curry.next;
 			curry.next = temp;
	}

	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String args[]) {
		LinkedList9 llist = new LinkedList9();
		llist.push(21);
		llist.push(31);
		llist.push(41);
		llist.push(51);
		llist.push(61);
		llist.push(71);

		System.out.println("List Before Swap: ");
		llist.printList();

		System.out.println("List After Swap: ");
		llist.SwapNodes(21, 71);
		llist.printList();
	}
}